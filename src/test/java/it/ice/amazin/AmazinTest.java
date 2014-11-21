package it.ice.amazin;

import static it.ice.amazin.Config.XLS_URI;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import it.ice.amazin.amazon.Amazon;
import it.ice.amazin.amazon.model.Product;
import it.ice.amazin.brandsdistribution.BrandsDistribution;
import it.ice.amazin.brandsdistribution.model.Item;

import java.util.List;

import org.junit.Test;

public class AmazinTest {
	@Test
	public void testItemFromXls() {
		Config config = Config.getInstance();
		List<Item> items = BrandsDistribution.getInstance().fromXls(
				config.get(XLS_URI));
		for (Item item : items) {
			System.out.println(item.item_sku);
		}
	}

	@Test
	public void testProduct2Xml() {
		String path = "res/xml/Product.xml";
		Product product = new Product();
		XmlManager.getInstance().fromObject(product, path);
	}

	@Test
	public void testXml2Product() {
		String path = "res/xml/ProductExample.xml";
		Product product = XmlManager.getInstance().toProduct(path);
		System.out.println(product);
	}

	@Test
	public void testSubmissionList() {
		Amazon amazon = Amazon.getInstance();
		List<String> submissions = amazon.getCompletedSubmissions();
		assertNotNull(submissions);
		boolean ok = amazon.checkSubmission("78442016383");
		assertTrue(ok);
	}
}
