package com.twitter.teruteru128.study.sf;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.xml.sax.InputSource;

/**
 * シャンフロ「2ヶ月以上更新されていません」の注意書きが出るまでの期間
 * 
 * @see https://twitter.com/nemnem4935/status/1498230943701606401
 */
public class Shangri_laFrontierCountDown implements Runnable {

  XPathFactory xPathFactory = XPathFactory.newInstance();
  XPath xPath = xPathFactory.newXPath();

  public Shangri_laFrontierCountDown() {
    xPath.setNamespaceContext(new AtomNamespaceContext());
  }

  @SuppressWarnings("unchecked")
  protected <T> T getLastPublished(URL url, String expression, Class<?> clazz) {
    try (var o = url.openStream()) {
      var inputSource = new InputSource(o);
      var exp = xPath.compile(expression);
      return (T) exp.evaluateExpression(inputSource, clazz);
    } catch (IOException | XPathExpressionException e) {
      throw new RuntimeException(e);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public void run() {
    var expression = "/atom:feed/atom:entry[1]/atom:published/text()";
    String lastPublished = null;
    try {
      lastPublished = this.<String>getLastPublished(new URL("https://api.syosetu.com/writernovel/474038.Atom"), expression, String.class);
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
    if (lastPublished.length() == 0) {
      System.out.println("lastPublished is null!!");
      return;
    }
    // https://api.syosetu.com/writernovel/474038.Atom
    var lastUpdate = OffsetDateTime.parse(lastPublished, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    var dateAndTimeWhenTheWarningIsPosted = lastUpdate.plus(8, ChronoUnit.WEEKS);
    var now = OffsetDateTime.now();
    var unit = ChronoUnit.DAYS;
    System.out.printf("%s%s%n", now.until(dateAndTimeWhenTheWarningIsPosted, unit), unit);
  }

}
