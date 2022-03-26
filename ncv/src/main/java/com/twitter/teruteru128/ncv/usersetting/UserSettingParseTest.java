package com.twitter.teruteru128.ncv.usersetting;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class UserSettingParseTest {
    public static void main(final String[] args) throws ParserConfigurationException, SAXException, IOException {
        if (args.length < 1) {
            System.err.println("");
            Runtime.getRuntime().exit(1);
        }

        final SAXParserFactory factory = SAXParserFactory.newInstance();
        factory.setNamespaceAware(true);
        try {
            final SAXParser parser = factory.newSAXParser();
            final HashSet<UserB> set = new HashSet<>();
            parser.parse(new File(args[0]), new Handler(set));
        } finally {
        }
    }
}
