package com.github.teruteru128.sample;

import com.github.teruteru128.sample.dynamic.DynamicServiceServlet;
import com.github.teruteru128.sample.forward.FooterIncludeServlet;
import com.github.teruteru128.sample.forward.ForwardStep1Servlet;
import com.github.teruteru128.sample.forward.ForwardStep2Servlet;
import com.github.teruteru128.sample.forward.HeaderIncludeServlet;
import com.github.teruteru128.sample.sql.SQLiteConnectSample;
import jakarta.servlet.http.HttpServletResponse;
import java.nio.file.Path;
import java.util.logging.Logger;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.servlets.DefaultServlet;
import org.apache.catalina.session.StandardManager;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.valves.AccessLogValve;
import org.apache.tomcat.util.descriptor.web.ContextResource;
import org.apache.tomcat.util.descriptor.web.ErrorPage;

public class Main {

  private static final Logger logger = Logger.getLogger(Main.class.getName());

  public static void main(String[] args) {
    var tomcat = new Tomcat();

    tomcat.setBaseDir("temp");

    int port = 8080;

    tomcat.setPort(port);
    tomcat.getConnector();
    tomcat.enableNaming();

    var contextPath = "";
    var docBase = Path.of("").toAbsolutePath().toString();
    logger.info("docBase: " + docBase);
    var context = (StandardContext) tomcat.addContext(contextPath, docBase);

    // プロセスをキルする方式だとセッションを保存できない
    var manager = new StandardManager();
    manager.setPathname("SESSIONS.ser");
    context.setManager(manager);

    var resource = new ContextResource();
    resource.setName("jdbc/SQLiteDataSource");
    resource.setType("javax.sql.DataSource");
    // factory を書き換えないとデフォルトのファクトリーではモジュール競合で参照不可
    resource.setProperty("factory", "org.apache.tomcat.jdbc.pool.DataSourceFactory");
    resource.setProperty("driverClassName", "org.sqlite.JDBC");
    resource.setProperty("url", "jdbc:sqlite:test.db");
    resource.setProperty("username", "");
    resource.setProperty("password", "");
    context.getNamingResources().addResource(resource);

    var defaultServlet = "DefaultServlet";
    tomcat.addServlet(contextPath, defaultServlet, new DefaultServlet());
    context.addServletMappingDecoded("/", defaultServlet);
    context.addWelcomeFile("index.jsp");

    var topPageServlet = "TopPageServlet";
    tomcat.addServlet(contextPath, topPageServlet, new TopPageServlet());
    context.addServletMappingDecoded("/index.jsp", topPageServlet);

    var errorPage404 = new ErrorPage();
    errorPage404.setLocation("/errors/404");
    errorPage404.setErrorCode(HttpServletResponse.SC_NOT_FOUND);
    context.addErrorPage(errorPage404);

    var errorPage500 = new ErrorPage();
    errorPage500.setLocation("/errors/500");
    errorPage500.setErrorCode(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    context.addErrorPage(errorPage500);

    var errorsServiceServletName = "ErrorsServiceServlet";
    tomcat.addServlet(contextPath, errorsServiceServletName, new ErrorsServiceServlet());
    context.addServletMappingDecoded("/errors/404", errorsServiceServletName);
    context.addServletMappingDecoded("/errors/500", errorsServiceServletName);

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

    var SQLiteConnectSampleName = "SQLiteConnectSample";
    tomcat.addServlet(contextPath, SQLiteConnectSampleName, new SQLiteConnectSample());
    context.addServletMappingDecoded("/api/sqlite", SQLiteConnectSampleName);

    var hashServletName = "HashServlet";
    tomcat.addServlet(contextPath, hashServletName, new HashServlet());
    context.addServletMappingDecoded("/api/hash/*", hashServletName);

    var primesServletName = "PrimesServlet";
    tomcat.addServlet(contextPath, primesServletName, new PrimesServlet());
    context.addServletMappingDecoded("/api/primes/create", primesServletName);

    var primesViewerServletName = "PrimesViewerServlet";
    tomcat.addServlet(contextPath, primesViewerServletName, new PrimesViewerServlet());
    context.addServletMappingDecoded("/api/primes/viewer", primesViewerServletName);

    var doSName = "DoSServlet";
    tomcat.addServlet(contextPath, doSName, new DoSServlet());
    context.addServletMappingDecoded("/api/dos", doSName);

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
