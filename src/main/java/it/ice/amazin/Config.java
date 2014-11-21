package it.ice.amazin;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Config {
	private final static String PREFIX = Config.class.getPackage().getName();

	public final static String CSV_URI = "csv.uri";
	public final static String CSV_ROW_SEP = "csv.rowsep";
	public final static String CSV_COL_SEP = "csv.colsep";
	public final static String CSV_STRING_SEP = "csv.stringsep";
	public final static String CSV_HAS_HEADER = "csv.hasheader";
	public final static String CSV_UPDATE_INTERVAL = "csv.updateinterval";

	public final static String XLS_URI = "xls.uri";
	public final static String XLS_UPDATE_INTERVAL = "xls.updateinterval";

	public final static String AMAZON_SERVICE_URL = "amazon.serviceurl";
	public final static String AMAZON_ACCESS_KEY = "amazon.accesskey";
	public final static String AMAZON_SECRET_KEY = "amazon.secretkey";
	public final static String AMAZON_APP_NAME = "amazon.appname";
	public final static String AMAZON_APP_VERSION = "amazon.appversion";
	public final static String AMAZON_MERCHANT_ID = "amazon.sellerid";
	public final static String AMAZON_MARKETPLACE = "amazon.marketplace";

	private static Config instance;

	private Properties props;

	public static Config getInstance() {
		if (instance == null) {
			instance = new Config();
		}
		return instance;
	}

	private Config() {
		props = new Properties();
		try {
			props.load(new FileReader("res/amazin.properties"));
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}

	public String get(String key) {
		return props.getProperty(PREFIX + "." + key);
	}

	public Config set(String key, String value) {
		props.put(PREFIX + "." + key, value);
		return this;
	}
}
