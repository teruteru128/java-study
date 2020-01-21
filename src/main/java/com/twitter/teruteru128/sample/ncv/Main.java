package com.twitter.teruteru128.sample.ncv;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.EntityReference;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Main extends DefaultHandler {

	public static void main(String[] args) throws Exception {
		Path path = Paths.get("C:\\Users\\terut\\AppData\\Roaming\\posite-c\\NiconamaCommentViewer\\UserSetting.xml");
		String uri = path.toUri().toString();

		/*
		 * SAXParserFactory factory = SAXParserFactory.newInstance();
		 * factory.setNamespaceAware(true); SAXParser parser = factory.newSAXParser();
		 * parser.parse(uri, new Main());
		 */

		DocumentBuilderFactory factory2 = DocumentBuilderFactory.newInstance();
		factory2.setNamespaceAware(true);
		factory2.setExpandEntityReferences(true);
		DocumentBuilder builder = factory2.newDocumentBuilder();
		Document document = builder.parse(uri);
		Element root = document.getDocumentElement();
		String uri1 = "http://posite-c.jp/niconamacommentviewer/usersetting/";
		String uri2 = "http://posite-c.jp/niconamacommentviewer/common/";
		NodeList list = root.getElementsByTagNameNS(uri1, "user");
		int length = list.getLength();
		ArrayList<User> users = new ArrayList<>(length);
		for (int i = 0; i < length; i++) {
			Node node = list.item(i);
			if (node instanceof Element) {
				Element element = (Element) node;

				User user = new User();
				String name = element.getAttributeNS(null, "name");
				String id = element.getFirstChild().getNodeValue();
				String community = element.getAttributeNS(null, "community");
				String bgcolor = element.getAttributeNS(null, "bgcolor");
				String readoutStr = element.getAttributeNS(null, "is_readout");
				boolean readout = readoutStr.isEmpty() ? true : Boolean.parseBoolean(readoutStr);
				long time = Long.parseLong(element.getAttributeNS(null, "time"), 10);

				user.setName(name.replaceAll("&", "&amp;").replaceAll("\"", "&quot;").replaceAll("\n", "&#xA;"));
				user.setId(id);
				user.setCommunity(community);
				user.setTime(time);
				user.setBgcolor(bgcolor);
				user.setReadout(readout);
				users.add(user);
			}
		}
		users.stream().distinct().sorted().forEach(System.out::println);
	}

	public Main() {
	}

	@Override
	public void startDocument() throws SAXException {
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		super.characters(ch, start, length);
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		super.endElement(uri, localName, qName);
	}

	@Override
	public void endDocument() throws SAXException {
		super.endDocument();
	}
}
