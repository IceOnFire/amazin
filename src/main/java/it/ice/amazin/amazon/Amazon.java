package it.ice.amazin.amazon;

import static it.ice.amazin.Config.AMAZON_ACCESS_KEY;
import static it.ice.amazin.Config.AMAZON_APP_NAME;
import static it.ice.amazin.Config.AMAZON_APP_VERSION;
import static it.ice.amazin.Config.AMAZON_MARKETPLACE;
import static it.ice.amazin.Config.AMAZON_MERCHANT_ID;
import static it.ice.amazin.Config.AMAZON_SECRET_KEY;
import static it.ice.amazin.Config.AMAZON_SERVICE_URL;
import it.ice.amazin.Config;
import it.ice.amazin.XmlManager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.amazonaws.mws.MarketplaceWebService;
import com.amazonaws.mws.MarketplaceWebServiceClient;
import com.amazonaws.mws.MarketplaceWebServiceConfig;
import com.amazonaws.mws.MarketplaceWebServiceException;
import com.amazonaws.mws.model.FeedSubmissionInfo;
import com.amazonaws.mws.model.GetFeedSubmissionListRequest;
import com.amazonaws.mws.model.GetFeedSubmissionListResponse;
import com.amazonaws.mws.model.GetFeedSubmissionResultRequest;
import com.amazonaws.mws.model.GetFeedSubmissionResultResponse;
import com.amazonaws.mws.model.IdList;
import com.amazonaws.mws.model.SubmitFeedRequest;
import com.amazonaws.mws.model.SubmitFeedResponse;

public class Amazon {
	private static Amazon singleton;

	private MarketplaceWebService service;
	private String merchantId;
	private IdList marketplaces;

	public static Amazon getInstance() {
		if (singleton == null) {
			singleton = new Amazon();
		}
		return singleton;
	}

	private Amazon() {
		Config cfg = Config.getInstance();

		String accessKeyId = cfg.get(AMAZON_ACCESS_KEY);
		String secretAccessKey = cfg.get(AMAZON_SECRET_KEY);
		String appName = cfg.get(AMAZON_APP_NAME);
		String appVersion = cfg.get(AMAZON_APP_VERSION);

		MarketplaceWebServiceConfig config = new MarketplaceWebServiceConfig();
		config.setServiceURL(cfg.get(AMAZON_SERVICE_URL));

		service = new MarketplaceWebServiceClient(accessKeyId, secretAccessKey,
				appName, appVersion, config);

		merchantId = cfg.get(AMAZON_MERCHANT_ID);
		marketplaces = new IdList(Arrays.asList(cfg.get(AMAZON_MARKETPLACE)));
	}

	public String submitFeed(String path) {
		SubmitFeedRequest request = new SubmitFeedRequest();
		request.setMerchant(merchantId);
		request.setMarketplaceIdList(marketplaces);

		request.setFeedType("_POST_PRODUCT_DATA_");

		try {
			request.setFeedContent(new FileInputStream(path));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		SubmitFeedResponse response = null;

		try {
			response = service.submitFeedFromFile(request);
		} catch (MarketplaceWebServiceException e) {
			e.printStackTrace();
			return null;
		}

		XmlManager.getInstance().fromObject(response, System.out);

		return response.getSubmitFeedResult().getFeedSubmissionInfo()
				.getFeedSubmissionId();
	}

	public List<String> getCompletedSubmissions() {
		List<String> idList = new ArrayList<String>();
		GetFeedSubmissionListRequest request = new GetFeedSubmissionListRequest();
		request.setMerchant(merchantId);

		GetFeedSubmissionListResponse response = null;
		try {
			response = service.getFeedSubmissionList(request);
		} catch (MarketplaceWebServiceException e) {
			e.printStackTrace();
			return idList;
		}

		XmlManager.getInstance().fromObject(response,
				"res/xml/FeedSubmissionList_" + new Date().getTime() + ".xml");
		XmlManager.getInstance().fromObject(response, System.out);

		if (!response.getGetFeedSubmissionListResult().isHasNext()) {
			System.out.println("empty list");
			return idList;
		}

		for (FeedSubmissionInfo info : response.getGetFeedSubmissionListResult()
				.getFeedSubmissionInfoList()) {
			if ("_DONE_".equals(info.getFeedProcessingStatus())) {
				idList.add(info.getFeedSubmissionId());
			}
		}

		return idList;
	}

	public boolean checkSubmission(String submissionId) {
		GetFeedSubmissionResultRequest request = new GetFeedSubmissionResultRequest();
		request.setMerchant(merchantId);
		request.setFeedSubmissionId(submissionId);

		GetFeedSubmissionResultResponse response = null;
		try {
			response = service.getFeedSubmissionResult(request);
		} catch (MarketplaceWebServiceException e) {
			e.printStackTrace();
			return false;
		}

		XmlManager.getInstance().fromObject(
				response,
				"res/xml/FeedSubmissionReport_" + submissionId + "_"
						+ new Date().getTime() + ".xml");
		XmlManager.getInstance().fromObject(response, System.out);
		
		return response.isSetGetFeedSubmissionResultResult();
	}
}
