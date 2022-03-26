package com.twitter.teruteru128.ncv.usersetting;

import java.io.IOException;
import java.util.HashSet;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

public class Handler extends DefaultHandler {
    protected final HashSet<UserB> set;

    public Handler(final HashSet<UserB> set) {
        this.set = set;
    }

    @Override
    public void startDocument() throws SAXException {
    }

    @Override
    public void startElement(final String uri, final String localName, final String qName, final Attributes attributes)
            throws SAXException {
        System.out.println(localName);
    }

    @Override
    public void characters(final char[] ch, final int start, final int length) throws SAXException {
    }

    @Override
    public void endElement(final String uri, final String localName, final String qName) throws SAXException {
    }

    @Override
    public void endDocument() throws SAXException {
    }

    @Override
    public void warning(SAXParseException exception) throws SAXException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void error(SAXParseException exception) throws SAXException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void fatalError(SAXParseException exception) throws SAXException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setDocumentLocator(Locator locator) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void startPrefixMapping(String prefix, String uri) throws SAXException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void endPrefixMapping(String prefix) throws SAXException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void processingInstruction(String target, String data) throws SAXException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void skippedEntity(String name) throws SAXException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void notationDecl(String name, String publicId, String systemId) throws SAXException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void unparsedEntityDecl(String name, String publicId, String systemId, String notationName)
            throws SAXException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public InputSource resolveEntity(String publicId, String systemId) throws SAXException, IOException {
        // TODO Auto-generated method stub
        return null;
    }
}
