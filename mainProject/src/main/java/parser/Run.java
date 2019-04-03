package parser;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import javax.xml.stream.XMLStreamException;
import com.google.common.base.Joiner;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class Run {

	private static final String DATA_XML = "data.xml";

	public static String dataFill() throws ParserConfigurationException, SAXException, IOException, XMLStreamException {
		Sax sax = new Sax();
		List<DataTest> dataList = sax.getData();
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document document = dBuilder.parse(DATA_XML);
		dataList = new Dom().parse(document);
		String fill = Joiner.on(" ").join(dataList);

		return fill;
	}

}
