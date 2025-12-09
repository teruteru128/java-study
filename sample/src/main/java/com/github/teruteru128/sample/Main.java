package com.github.teruteru128.sample;

import java.nio.file.Path;
import java.util.logging.Logger;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.servlets.DefaultServlet;
import org.apache.catalina.startup.Tomcat;

public class Main {

  private static final Logger logger = Logger.getLogger(Main.class.getName());

  public static void main(String[] args) {
    var tomcat = new Tomcat();

    tomcat.setBaseDir("temp");

    int port = 8080;

    tomcat.setPort(port);
    tomcat.getConnector();

    var contextPath = "/";
    var docBase = Path.of("").toAbsolutePath().toString();
    logger.info("docBase: " + docBase);
    var context = tomcat.addContext(contextPath, docBase);

    var servletName = "DynamicServiceServlet";
    tomcat.addServlet(contextPath, servletName, new DynamicServiceServlet());
    context.addServletMappingDecoded("/api/hello", servletName);

    try {
      tomcat.start();
      System.out.println("Tomcat server started on http://localhost:" + port);
      tomcat.getServer().await();
    } catch (LifecycleException e) {
      throw new RuntimeException(e);
    }
  }
}
