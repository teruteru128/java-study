package com.twitter.teruteru128.test.ncv;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

public class Main {
    public static void main(String[] args) {

        SAXParserFactory factory = SAXParserFactory.newInstance();
        factory.setNamespaceAware(true);
        try {
            SAXParser parser = factory.newSAXParser();
            HashSet<User> set = new HashSet<>();
            parser.parse(
                    new File("C:\\Users\\terut\\AppData\\Roaming\\posite-c\\NiconamaCommentViewer", "UserSetting.xml"),
                    new Handler(set));
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class UserFactory {
    private static UserFactory INSTANCE = new UserFactory();

    private UserFactory() {
    }

    public static UserFactory getInstance() {
        return INSTANCE;
    }
}

class Handler extends DefaultHandler {
    private HashSet<User> set;
    public Handler(HashSet<User> set){
        this.set = set;
    }
    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println(localName);
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
