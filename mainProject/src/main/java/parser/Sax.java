package parser;

import java.util.ArrayList;

import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import parser.DataTest;;

public class Sax extends DefaultHandler {
	private List<DataTest> dataList;
	private DataTest data;
	boolean bMail = false;

	public List<DataTest> getData() {
		return dataList;
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

		if (qName.equalsIgnoreCase("ForMail")) {
			String id = attributes.getValue("id");
			data = new DataTest();
			data.setId(Integer.parseInt(id));
			if (dataList == null) {
				dataList = new ArrayList<>();
			}
		} else if (qName.equalsIgnoreCase("mail")) {
			bMail = true;
		}

	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equalsIgnoreCase("ForMail")) {
			dataList.add(data);
		}
	}

	@Override
	public void characters(char ch[], int start, int length) throws SAXException {

		if (bMail) {
			data.setMail(new String(ch, start, length));
			bMail = false;
		}

	}
}
