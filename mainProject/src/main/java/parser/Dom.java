package parser;

import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import parser.DataTest;

public class Dom {
	public List<DataTest> parse(Document document) throws FileNotFoundException, XMLStreamException {
		NodeList nodeList = document.getElementsByTagName("mail");
		List<DataTest> data = new ArrayList<DataTest>();
		for (int i = 0; i < nodeList.getLength(); i++) {
			data.add(getDataTest(nodeList.item(i)));
		}
		return data;
	}

	private static DataTest getDataTest(Node node) {
		DataTest data = new DataTest();
		Element element = (Element) node;
		data.setId(Integer.parseInt(element.getAttribute("id")));
		data.setMail(getTagValue("mail", element));

		return data;
	}

	private static String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = nodeList.item(0);
		return node.getNodeValue();
	}
}