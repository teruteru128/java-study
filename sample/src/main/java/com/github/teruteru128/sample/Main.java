package com.github.teruteru128.sample;

import jakarta.servlet.http.HttpServletResponse;
import java.nio.file.Path;
import java.util.logging.Logger;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.Service;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.servlets.DefaultServlet;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.valves.AccessLogValve;
import org.apache.tomcat.util.descriptor.web.ErrorPage;

public class Main {

  private static final Logger logger = Logger.getLogger(Main.class.getName());

  public static void main(String[] args) {
    var tomcat = new Tomcat();

    tomcat.setBaseDir("temp");

    int port = 8080;

    tomcat.setPort(port);
    tomcat.getConnector();

    var contextPath = "";
    var docBase = Path.of("").toAbsolutePath().toString();
    logger.info("docBase: " + docBase);
    var context = (StandardContext) tomcat.addContext(contextPath, docBase);

    tomcat.addServlet(contextPath, "DefaultServlet", new DefaultServlet());
    context.addServletMappingDecoded("/", "DefaultServlet");
    context.addWelcomeFile("index.html");

    var errorPage404 = new ErrorPage();
    errorPage404.setLocation("/errors/404.html");
    errorPage404.setErrorCode(HttpServletResponse.SC_NOT_FOUND);
    context.addErrorPage(errorPage404);

    var errorPage500 = new ErrorPage();
    errorPage500.setLocation("/errors/500.html");
    errorPage500.setErrorCode(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    context.addErrorPage(errorPage500);

    var dynamicServletName = "DynamicServiceServlet";
    tomcat.addServlet(contextPath, dynamicServletName, new DynamicServiceServlet());
    context.addServletMappingDecoded("/api/hello", dynamicServletName);

    var forwardStep1ServletName = "ForwardStep1Servlet";
    tomcat.addServlet(contextPath, forwardStep1ServletName, new ForwardStep1Servlet());
    context.addServletMappingDecoded("/api/forward1", forwardStep1ServletName);

    var forwardStep2ServletName = "ForwardStep2Servlet";
    tomcat.addServlet(contextPath, forwardStep2ServletName, new ForwardStep2Servlet());
    context.addServletMappingDecoded("/api/forward2", forwardStep2ServletName);

    var headerServletName = "HeaderServlet";
    tomcat.addServlet(contextPath, headerServletName, new HeaderIncludeServlet());
    context.addServletMappingDecoded("/api/header", headerServletName);

    var footerServletName = "FooterServlet";
    tomcat.addServlet(contextPath, footerServletName, new FooterIncludeServlet());
    context.addServletMappingDecoded("/api/footer", footerServletName);

    context.addMimeMapping("html", "text/html");

    var valve = new AccessLogValve();
    valve.setPattern("%t %a %A %v %r");
    tomcat.getEngine().getPipeline().addValve(valve);

    try {
      tomcat.start();
      System.out.println("Tomcat server started on http://localhost:" + port);
      tomcat.getServer().await();
    } catch (LifecycleException e) {
      throw new RuntimeException(e);
    }
  }
}
