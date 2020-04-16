package com.twitter.teruteru128.twitter_bot;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import twitter4j.auth.AccessToken;

/**
 * 
 *
 */
public final class ConfigurationLodaer {
    private static DocumentBuilderFactory factory = null;
    private static DocumentBuilder builder = null;
    private static XPath xpath = null;

    private ConfigurationLodaer() {
    }

    public static ConsumerKey loadConsumerKey(String file) {
        ConsumerKey key = null;
        try {
            // ビルダー生成
            DocumentBuilder b = getDocumentBuilder();
            // ファイル読み込み
            Document doc = b.parse(ClassLoader.getSystemResource(file).openConnection().getInputStream());
            // TODO XPathの勉強
            // アカウント要素のみを抽出
            XPathExpression consumerExpr = createXPath("/configurations/consumer");
            // アクセストークン
            XPathExpression consumerKeyExpr = createXPath("./consumerkey");
            // トークンシークレット
            XPathExpression consumerSecretExpr = createXPath("./consumersecret");
            // Nodeリストとして読み込み
            Object o = consumerExpr.evaluate(doc, XPathConstants.NODESET);
            NodeList accountList = (NodeList) o;
            for (int i = 0; i < accountList.getLength(); i++) {
                // アカウント
                if (accountList.item(i) instanceof Element) {
                    Element account = (Element) accountList.item(i);
                    // アクセストークンをNodeとして取り出し
                    Node consumerKey = (Node) consumerKeyExpr.evaluate(account, XPathConstants.NODE);
                    // トークンシークレットをNodeとして取り出し
                    Node consumerSecret = (Node) consumerSecretExpr.evaluate(account, XPathConstants.NODE);
                    // アクセストークンリストに追加(trimは必須)
                    key = new ConsumerKey(consumerKey.getTextContent().trim(), consumerSecret.getTextContent().trim());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        return key;
    }

    public static ArrayList<AccessToken> loadAccessToken(String file) {
        // 初期化
        ArrayList<AccessToken> accessTokens = new ArrayList<>();
        try {
            // ビルダー生成
            DocumentBuilder b = getDocumentBuilder();
            // ファイル読み込み
            Document doc = b.parse(ClassLoader.getSystemResource(file).openConnection().getInputStream());
            // TODO XPathの勉強
            // アカウント要素のみを抽出
            XPathExpression accountExpr = createXPath("/configurations/accounts/account");
            // アクセストークン
            XPathExpression tokenExpr = createXPath("./accesstoken");
            // トークンシークレット
            XPathExpression secretExpr = createXPath("./tokensecret");
            // Nodeリストとして読み込み
            Object o = accountExpr.evaluate(doc, XPathConstants.NODESET);
            NodeList accountList = (NodeList) o;
            for (int i = 0; i < accountList.getLength(); i++) {
                // アカウント
                if (accountList.item(i) instanceof Element) {
                    Element account = (Element) accountList.item(i);
                    // アクセストークンをNodeとして取り出し
                    Node token = (Node) tokenExpr.evaluate(account, XPathConstants.NODE);
                    // トークンシークレットをNodeとして取り出し
                    Node secret = (Node) secretExpr.evaluate(account, XPathConstants.NODE);
                    // アクセストークンリストに追加(trimは必須)
                    accessTokens.add(new AccessToken(token.getTextContent().trim(), secret.getTextContent().trim()));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        return accessTokens;
    }

    private static DocumentBuilderFactory getDocumentBuilderFactory() {
        //
        if (factory == null) {
            factory = DocumentBuilderFactory.newInstance();
        }
        return factory;
    }

    private static DocumentBuilder getDocumentBuilder() {
        if (builder == null) {
            DocumentBuilderFactory f = getDocumentBuilderFactory();

            try {
                builder = f.newDocumentBuilder();
            } catch (ParserConfigurationException e) {
                e.printStackTrace();
            }
        }
        return builder;
    }

    private static XPathExpression createXPath(String expression) throws XPathExpressionException {
        if (xpath == null) {
            XPathFactory xPathFactory = XPathFactory.newInstance();
            xpath = xPathFactory.newXPath();
        }
        XPathExpression x = xpath.compile(expression);
        return x;
    }
}
