package com.trainings.jaxb.processor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.Marshaller;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

@Service
public class Processor{
	
	@Autowired
	private Marshaller marshaller;
    
	public void convertFromObjectToXML(Object object, String filepath)
		throws IOException {

		FileOutputStream os = null;
		try {
			os = new FileOutputStream(filepath);
			marshaller.marshal(object, new StreamResult(os));
		} finally {
			if (os != null) {
				os.close();
			}
		}
	}

	public Object convertFromXMLToObject(String xmlfile) throws IOException {

		FileInputStream is = null;
		try {
			is = new FileInputStream(xmlfile);
			return ((Unmarshaller) marshaller).unmarshal(new StreamSource(is));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (is != null) {
				is.close();
			}
		}
		
		return null;
	}
}
