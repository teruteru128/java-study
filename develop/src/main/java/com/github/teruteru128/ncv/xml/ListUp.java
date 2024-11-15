package com.github.teruteru128.ncv.xml;

import com.github.teruteru128.color.ColorConverter;
import com.github.teruteru128.color.RGBColor;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
import picocli.CommandLine.Command;

@Command(name = "listUp")
public class ListUp implements Callable<Void> {

  private final Path inputPath;

  public ListUp(Path inputPath) {
    this.inputPath = inputPath;
  }

  @Override
  public Void call()
      throws IOException, ParserConfigurationException, SAXException, TransformerException, NoSuchAlgorithmException {
    var factory = DocumentBuilderFactory.newInstance();
    factory.setNamespaceAware(true);
    var builder = factory.newDocumentBuilder();
    Document doc;
    try (var in = new BufferedInputStream(Files.newInputStream(inputPath))) {
      doc = builder.parse(in);
    }
    var root = doc.getDocumentElement();
    var users = root.getChildNodes();
    int length = users.getLength();
    var bgcolorName = "bgcolor";
    Node item;
    Element user;
    int bgcolor;
    for (int i = 0; i < length; i++) {
      item = users.item(i);
      if (item.getNodeType() != Node.ELEMENT_NODE) {
        continue;
      }
      user = (Element) item;
      if (user.hasAttributeNS(null, bgcolorName)) {
        bgcolor = Integer.parseInt(user.getAttributeNS(null, bgcolorName));
        var hls = ColorConverter.RGBToHLS(new RGBColor(bgcolor));
        if (hls.s() < 0.5) {
          System.out.printf("%s: %s%n", user.getTextContent(), user.getAttributeNS(null, "name"));
        }
      }
    }
    return null;
  }
}
