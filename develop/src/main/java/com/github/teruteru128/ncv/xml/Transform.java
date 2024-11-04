package com.github.teruteru128.ncv.xml;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.concurrent.Callable;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class Transform implements Callable<Void> {

  private final Path inputPath;
  private final Path outputPath;

  public Transform(Path inputPath, Path outputPath) {
    this.inputPath = inputPath;
    this.outputPath = outputPath;
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
    var random = SecureRandom.getInstanceStrong();
    Node item;
    Element user;
    int bgcolor;
    for (int i = 0; i < length; i++) {
      item = users.item(i);
      if (item.getNodeType() != Node.ELEMENT_NODE) {
        continue;
      }
      user = (Element) item;
      if (!user.hasAttributeNS(null, bgcolorName)) {
        bgcolor = random.nextInt(0xFF000000, 0x00000000);
        user.setAttributeNS(null, bgcolorName, Integer.toString(bgcolor));
      }
    }
    var tfFactory = TransformerFactory.newInstance();
    var transformer = tfFactory.newTransformer();
    transformer.setOutputProperty("indent", "yes");
    transformer.setOutputProperty("encoding", "UTF-8");
    try (var writer = Files.newBufferedWriter(outputPath)) {
      transformer.transform(new DOMSource(root), new StreamResult(writer));
    }
    return null;
  }
}
