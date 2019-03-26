package group23.homework26;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import group23.homework26.Dom;
import group23.homework26.Country;
import group23.homework26.Sax;
import group23.homework26.Stax;

public class Run {

	private static final String COUNRTY_XML = "country.xml";

	public static void main(String[] args)
			throws ParserConfigurationException, SAXException, IOException, XMLStreamException {
		System.out.println("SAX");
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		SAXParser saxParser = saxParserFactory.newSAXParser();
		Sax hw26_saxParser = new Sax();
		saxParser.parse(new File(COUNRTY_XML), hw26_saxParser);
		List<Country> countries = hw26_saxParser.getCountries();
		countries.forEach(country -> System.out.println(country));

		System.out.println("STAX");
		XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
		XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(COUNRTY_XML));
		countries = new Stax().parse(xmlEventReader);
		countries.forEach(country -> System.out.println(country));

		System.out.println("DOM");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document document = dBuilder.parse(COUNRTY_XML);
		countries = new Dom().parse(document);
		countries.forEach(country -> System.out.println(country));
	}

}
