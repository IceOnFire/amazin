package it.ice.amazin;

import it.ice.amazin.amazon.model.Product;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.amazonaws.mws.model.GetFeedSubmissionListResponse;
import com.amazonaws.mws.model.GetFeedSubmissionResultResponse;
import com.amazonaws.mws.model.SubmitFeedResponse;

public class Xml {
	private static JAXBContext jaxb;
	private static Xml singleton;

	public static Xml getInstance() {
		if (singleton == null) {
			singleton = new Xml();
		}
		return singleton;
	}

	private Xml() {
		try {
			jaxb = JAXBContext.newInstance(Product.class, SubmitFeedResponse.class,
					GetFeedSubmissionListResponse.class,
					GetFeedSubmissionResultResponse.class);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public void fromObject(Object object, OutputStream out) {
		try {
			Marshaller marshaller = jaxb.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(object, out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public void fromObject(Object object, String path) {
		try {
			fromObject(object, new FileOutputStream(path));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Product toProduct(InputStream in) {
		try {
			Unmarshaller unmarshaller = jaxb.createUnmarshaller();
			return (Product) unmarshaller.unmarshal(in);
		} catch (JAXBException e) {
			e.printStackTrace();
			return null;
		}
	}

	public Product toProduct(String path) {
		try {
			return toProduct(new FileInputStream(path));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
}
