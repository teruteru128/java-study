package com.twitter.teruteru128.study.sf;

import java.io.IOException;
import java.net.URL;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.NodeList;

/**
 * シャンフロ「2ヶ月以上更新されていません」の注意書きが出るまでの期間
 * 
 * @see https://twitter.com/nemnem4935/status/1498230943701606401
 */
public class Shangri_laFrontierCountDown implements Runnable {

  @Override
  public void run() {
    var xPath = XPathFactory.newInstance().newXPath();
    var expression = "/feed/entry[1]/published/text()";
    var dbf = DocumentBuilderFactory.newInstance();
    dbf.setNamespaceAware(true);
    try (var o = new URL("https://api.syosetu.com/writernovel/474038.Atom").openStream()) {
      var db = dbf.newDocumentBuilder();
      var doc = db.parse(o);
      xPath.setNamespaceContext(new AtomNamespaceContext());
      var exp = xPath.compile(expression);
      var obj = exp.evaluate(doc, XPathConstants.STRING);
      if (obj instanceof NodeList) {
        var nodes = (NodeList) obj;
        var length = nodes.getLength();
        System.out.printf("NodeList %s%n", length);
        for (int i = 0; i < length; i++) {
          var node = nodes.item(i);
          System.out.println(node);
          var feednodes = node.getChildNodes();
          var length2 = feednodes.getLength();
          for (int j = 0; j < length2; j++) {
            var n = feednodes.item(j);
            System.out.println(n);
          }
        }
      } else if (obj instanceof String) {
        System.out.printf("String : %s%n", obj);
      } else if (obj instanceof Double) {
        System.out.printf("Double : %s%n", obj);
      } else {
        System.out.printf("else %s%n", obj);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } catch (XPathExpressionException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
    // https://api.syosetu.com/writernovel/474038.Atom
    var lastUpdate = OffsetDateTime.parse("2022-03-11T06:32:58+09:00", DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    var dateAndTimeWhenTheWarningIsPosted = lastUpdate.plus(8, ChronoUnit.WEEKS);
    var now = OffsetDateTime.now();
    var unit = ChronoUnit.DAYS;
    System.out.printf("%s%s%n", now.until(dateAndTimeWhenTheWarningIsPosted, unit), unit);
  }

}
