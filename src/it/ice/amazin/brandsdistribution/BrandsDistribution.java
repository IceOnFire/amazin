package it.ice.amazin.brandsdistribution;

import static it.ice.amazin.Config.CSV_COL_SEP;
import static it.ice.amazin.Config.CSV_HAS_HEADER;
import static it.ice.amazin.Config.CSV_ROW_SEP;
import static it.ice.amazin.Config.CSV_STRING_SEP;
import it.ice.amazin.Config;
import it.ice.amazin.brandsdistribution.model.Item;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.http.client.fluent.Request;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class BrandsDistribution {
	private static BrandsDistribution singleton;

	public static BrandsDistribution getInstance() {
		if (singleton == null) {
			singleton = new BrandsDistribution();
		}
		return singleton;
	}

	public List<Item> fromXls(String uri) {
		List<Item> items = new ArrayList<Item>();

		try {
			InputStream is = Request.Get(uri).execute().returnContent().asStream();
			Workbook wb = new HSSFWorkbook(is);
			Sheet sheet = wb.getSheetAt(0);
			Iterator<Row> itR = sheet.rowIterator();
			int index = 0;
			while (itR.hasNext()) {
				Row row = itR.next();
				if (index == 0) {
					index++;
					continue;
				}

				Item item = new Item();

				String record_type = row.getCell(0).getStringCellValue().trim();
				if (record_type.equals("PRODUCT")) {
					item.item_sku = "" + row.getCell(1).getNumericCellValue();
					item.brand_name = row.getCell(2).getStringCellValue().trim();
					item.item_name = row.getCell(3).getStringCellValue().trim();
					item.number_of_items = "" + row.getCell(5).getNumericCellValue();
					item.standard_price = "" + row.getCell(6).getNumericCellValue();
					item.sale_price = "" + (row.getCell(7).getNumericCellValue() * 2.1);
					item.product_description = row.getCell(8).getStringCellValue().trim();
					item.website_shipping_weight = ""
							+ row.getCell(9).getNumericCellValue();
					item.main_image_url = row.getCell(10).getStringCellValue().trim();
					item.other_image_url1 = row.getCell(11).getStringCellValue().trim();
					item.other_image_url2 = row.getCell(12).getStringCellValue().trim();
					item.model = null;// row.getCell(13).getStringCellValue().trim();
					item.external_product_id = "";// EAN
				} else {
					item.parent_sku = "" + row.getCell(1).getNumericCellValue();
					item.size_map = row.getCell(14).getStringCellValue().trim();
					item.quantity = "0";// let's keep quantity 0 for test purposes
															// //row.getCell(15).getStringCellValue().trim();
				}
				items.add(item);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return items;
	}

	public List<Item> fromCsv(String uri) {
		Config config = Config.getInstance();
		String rowSep = config.get(CSV_ROW_SEP);
		String colSep = config.get(CSV_COL_SEP);
		String stringSep = config.get(CSV_STRING_SEP);
		boolean hasHeader = Boolean.parseBoolean(config.get(CSV_HAS_HEADER));

		String content = null;
		try {
			content = Request.Get(uri).execute().returnContent().asString();
		} catch (IOException e) {
		}

		String[] rows = content.split(rowSep);
		List<Item> items = new ArrayList<>();
		for (int i = hasHeader ? 1 : 0; i < rows.length; i++) {
			String row = rows[i];
			String[] cells = row.split(colSep);

			Item item = new Item();
			item.item_sku = cells[0].replace(stringSep, "");
			items.add(item);
		}

		return items;
	}
}
