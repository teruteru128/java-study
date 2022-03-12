package com.twitter.teruteru128.study.sf;

import java.io.IOException;
import java.net.URL;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.xml.sax.InputSource;

/**
 * シャンフロ「2ヶ月以上更新されていません」の注意書きが出るまでの期間
 * 
 * @see https://twitter.com/nemnem4935/status/1498230943701606401
 */
public class Shangri_laFrontierCountDown implements Runnable {

  @Override
  public void run() {
    var xPathFactory = XPathFactory.newInstance();
    var xPath = xPathFactory.newXPath();
    xPath.setNamespaceContext(new AtomNamespaceContext());
    var expression = "/atom:feed/atom:entry[1]/atom:published/text()";
    String lastPublished = null;
    try (var o = new URL("https://api.syosetu.com/writernovel/474038.Atom").openStream()) {
      var inputSource = new InputSource(o);
      var exp = xPath.compile(expression);
      /* 
      var obj = exp.evaluateExpression(inputSource, String.class);
      switch (obj.type()) {
        case NODE:
          System.out.println("Node");
          break;
        case ANY:
          System.out.println("any");

          break;
        case BOOLEAN:
          System.out.println("boolean");

          break;
        case STRING:
          System.out.println("string");

          break;
        case NUMBER:
          System.out.println("number");

          break;

        case NODESET:
          var nodes = (XPathNodes) obj.value();
          System.out.printf("Nodeset size:%d%n", nodes.size());
          for (Node node : nodes) {
            System.out.println(node);
            lastPublished = node.getTextContent();
          }
          break;
        default:
          System.out.println("default");
          break;
      }
      */
      lastPublished = exp.evaluateExpression(inputSource, String.class);
    } catch (IOException e) {
      e.printStackTrace();
    } catch (XPathExpressionException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.printf("lastPublished : %s(%d)%n", lastPublished, lastPublished.length());
    if (lastPublished.length() == 0) {
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
