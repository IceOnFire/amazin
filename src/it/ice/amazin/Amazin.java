package it.ice.amazin;

import static it.ice.amazin.Config.XLS_UPDATE_INTERVAL;
import static it.ice.amazin.Config.XLS_URI;
import it.ice.amazin.amazon.Amazon;
import it.ice.amazin.amazon.model.Product;
import it.ice.amazin.amazon.model.Product.DescriptionData;
import it.ice.amazin.brandsdistribution.BrandsDistribution;
import it.ice.amazin.brandsdistribution.model.Item;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Amazin {
	public static void testItemFromXls() {
		Config config = Config.getInstance();
		List<Item> items = BrandsDistribution.getInstance().fromXls(
				config.get(XLS_URI));
		for (Item item : items) {
			System.out.println(item.item_sku);
		}
	}

	public static void testProduct2Xml() {
		String path = "res/xml/Product.xml";
		Product product = new Product();
		Xml.getInstance().fromObject(product, path);
	}

	public static void testXml2Product() {
		String path = "res/xml/ProductExample.xml";
		Product product = Xml.getInstance().toProduct(path);
		System.out.println(product);
	}

	private static List<Product> getProducts() {
		Config config = Config.getInstance();
		List<Product> products = new ArrayList<Product>();
		List<Item> items = BrandsDistribution.getInstance().fromXls(
				config.get(XLS_URI));
		for (Item item : items) {
			Product product = item2Product(item);
			products.add(product);
		}
		return products;
	}

	private static Product item2Product(Item item) {
		Product product = new Product();
		product.setSKU(item.item_sku);
		product.setProductTaxCode(item.external_product_id);
		DescriptionData descriptionData = new DescriptionData();
		descriptionData.setTitle(item.item_name);
		descriptionData.setBrand(item.brand_name);
		descriptionData.setDescription(item.product_description);
		descriptionData.getBulletPoint().add(item.bullet_point1);
		descriptionData.getBulletPoint().add(item.bullet_point2);
		descriptionData.getBulletPoint().add(item.bullet_point3);
		descriptionData.getBulletPoint().add(item.bullet_point4);
		descriptionData.getBulletPoint().add(item.bullet_point5);
		descriptionData.setManufacturer(item.brand_name);
		descriptionData.getSearchTerms().add(item.generic_keywords1);
		descriptionData.getSearchTerms().add(item.generic_keywords2);
		descriptionData.getSearchTerms().add(item.generic_keywords3);
		descriptionData.getSearchTerms().add(item.generic_keywords4);
		descriptionData.getSearchTerms().add(item.generic_keywords5);
		descriptionData.setItemType(item.item_type);
		descriptionData
				.setIsGiftWrapAvailable(item.offering_can_be_giftwrapped != null
						&& item.offering_can_be_giftwrapped.trim().equalsIgnoreCase("true"));
		descriptionData
				.setIsGiftMessageAvailable(item.offering_can_be_gift_messaged != null
						&& item.offering_can_be_gift_messaged.trim().equalsIgnoreCase(
								"true"));
		// TODO: recommended browse node(s)
		// TODO: package quantity
		product.setNumberOfItems(BigInteger.valueOf(Long
				.parseLong(item.number_of_items)));
		product.setDescriptionData(descriptionData);
		return product;
	}

	public static void main(String[] args) {
		Config config = Config.getInstance();
		Amazon amazon = Amazon.getInstance();
		int updateInterval = Integer.parseInt(config.get(XLS_UPDATE_INTERVAL));

//		Product product = Xml.getInstance().toProduct("res/xml/ProductExample.xml");
//		Xml.getInstance().fromObject(product, "res/xml/Product.xml");

		List<String> submissions = amazon.getCompletedSubmissions();
//		for (String submissionId : submissions) {
//			amazon.checkSubmission(submissionId);
//		}
//		amazon.checkSubmission("78442016383");

		// List<Product> products = getProducts();
		// for (Product product : products) {
		// amazon.obj2Xml(product, "res/xml/Product.xml");
		//
		// String submissionId = amazon.submitFeed("res/xml/Product.xml");
		// boolean done = false;
		// while (!done) {
		// done = amazon.checkSubmission(submissionId);
		// }
		// }

		// new Timer().schedule(new TimerTask() {
		// @Override
		// public void run() {
		// submitFeed();
		// }
		// }, updateInterval * 60 * 1000, updateInterval * 60 * 1000);
	}
}
