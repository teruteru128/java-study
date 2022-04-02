package com.twitter.teruteru128.study.sf;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.Callable;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.xml.sax.InputSource;

/**
 * シャンフロ「2ヶ月以上更新されていません」の注意書きが出るまでの期間
 * 
 * @see https://twitter.com/nemnem4935/status/1498230943701606401
 */
public class Shangri_laFrontierCountDown implements Callable<Void> {

  private static final XPathFactory xPathFactory = XPathFactory.newInstance();
  private XPath xPath = xPathFactory.newXPath();

  public Shangri_laFrontierCountDown() {
    xPath.setNamespaceContext(new AtomNamespaceContext());
  }

  @SuppressWarnings("unchecked")
  protected <T> T getLastPublished(URL url, String expression, Class<?> clazz) throws IOException, XPathExpressionException {
    try (var o = url.openStream()) {
      var inputSource = new InputSource(o);
      var exp = xPath.compile(expression);
      return (T) exp.evaluateExpression(inputSource, clazz);
    }
  }

  private static final String EXPRESSION = "/atom:feed/atom:entry[1]/atom:published/text()";
  private static final String URL_SPEC = "https://api.syosetu.com/writernovel/474038.Atom";

  /**
   * 呼び出すたびに WEB リクエストが発生するので注意！！
   */
  @Override
  public Void call() throws IOException, XPathExpressionException {
    String lastPublishedString = null;
    try {
      lastPublishedString = this.<String>getLastPublished(new URL(URL_SPEC), EXPRESSION, String.class);
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
    if (lastPublishedString == null || lastPublishedString.length() == 0) {
      System.out.println("lastPublished is null!!");
      return null;
    }
    // https://api.syosetu.com/writernovel/474038.Atom
    var lastPublished = OffsetDateTime.parse(lastPublishedString, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    System.out.printf("シャンフロ最終更新日時: %s%n", lastPublished);
    var deadlineDateTime = lastPublished.plus(8, ChronoUnit.WEEKS);
    var currentDateTime = OffsetDateTime.now();
    var untilDeadlineDays = currentDateTime.until(deadlineDateTime, ChronoUnit.DAYS);
    System.out.printf("警告表示まであと%s%s #シャンフロ #最シ更遅%n", untilDeadlineDays, ChronoUnit.DAYS);
    return null;
  }

}
