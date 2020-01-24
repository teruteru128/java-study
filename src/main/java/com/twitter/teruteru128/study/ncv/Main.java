package com.twitter.teruteru128.study.ncv;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class Main {
    public static void main(final String[] args) {

        final SAXParserFactory factory = SAXParserFactory.newInstance();
        factory.setNamespaceAware(true);
        try {
            final SAXParser parser = factory.newSAXParser();
            final HashSet<User> set = new HashSet<>();
            parser.parse(
                    new File("C:\\Users\\terut\\AppData\\Roaming\\posite-c\\NiconamaCommentViewer", "UserSetting.xml"),
                    new Handler(set));
        } catch (final ParserConfigurationException e) {
            e.printStackTrace();
        } catch (final SAXException e) {
            e.printStackTrace();
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }
}
