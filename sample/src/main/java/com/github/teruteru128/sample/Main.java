package com.github.teruteru128.sample;

import jakarta.annotation.Nonnull;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.Security;
import java.util.Optional;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.servlets.DefaultServlet;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.valves.AccessLogValve;
import org.apache.catalina.valves.ErrorReportValve;
import org.apache.catalina.webresources.StandardRoot;
import org.apache.tomcat.util.descriptor.web.ContextResource;
import org.apache.tomcat.util.descriptor.web.ErrorPage;
import org.apache.tomcat.util.descriptor.web.FilterDef;
import org.apache.tomcat.util.descriptor.web.FilterMap;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tools.jackson.databind.ObjectMapper;

public class Main {

  private static final Logger logger = LoggerFactory.getLogger(Main.class.getName());

  static void main(String[] args) throws IOException {
    var bc = Security.getProvider("BC");
    if (bc == null) {
      Security.insertProviderAt(new BouncyCastleProvider(), 1);
    }
    var tomcat = new Tomcat();

    tomcat.setBaseDir("temp");

    int port = 8080;

    tomcat.setPort(port);
    tomcat.getConnector();
    tomcat.enableNaming();

    var contextPath = "";
    // 流石に current dir のままではsampleファイルとか見えちゃう
    var webPath = Path.of("web").toAbsolutePath();
    if (Files.notExists(webPath)) {
      try {
        Files.createDirectories(webPath);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
    var docBase = webPath.toString();
    var context = (StandardContext) tomcat.addContext(contextPath, docBase);

    // プロセスをキルする方式だとセッションを保存できない
    /*
    var manager = new StandardManager();
    manager.setPathname("SESSIONS.ser");
    context.setManager(manager);
    */

    context.setRequestCharacterEncoding(StandardCharsets.UTF_8.name());
    context.setResponseCharacterEncoding(StandardCharsets.UTF_8.name());

    context.setSessionTimeout(0);
    var root = new StandardRoot();
    //root.setCacheMaxSize(1024 * 1024);
    root.setAllowLinking(true);
    context.setResources(root);

    var namingResources = context.getNamingResources();

    namingResources.addResource(
        getJDBCContextResource("jdbc/SQLiteDataSource", "org.sqlite.JDBC", "jdbc:sqlite:sample.db",
            "", ""));
    // postgresqlはDBサーバーがないと例外を吐くので注意
    /*namingResources.addResource(getJDBCContextResource("jdbc/PostgresDataSource",
        "org.postgresql.Driver", "jdbc:postgresql://localhost:5432/postgres", "", ""));*/

    var listener = new ThymeleafConfiguration();
    context.addApplicationLifecycleListener(listener);
    var listener1 = new JacksonConfiguration();
    context.addApplicationLifecycleListener(listener1);

    boolean isListings = false;
    for (String arg : args) {
      if (arg.equals("--enable-listings")) {
        isListings = true;
        break;
      }
    }

    var configJsonSrc = "config.json";
    var configJsonPath = Path.of(configJsonSrc).toAbsolutePath();
    Optional<String> onionLocation = Optional.empty();
    if (Files.exists(configJsonPath) && Files.isRegularFile(configJsonPath) && Files.isReadable(
        configJsonPath)) {
      var jsonRoot = listener1.mapper.readTree(configJsonPath);
      onionLocation = Optional.of(jsonRoot.get("Onion-Location").asString());
    }

    var defaultServlet = "DefaultServlet";
    var wrapper = new Tomcat.ExistingStandardWrapper(new DefaultServlet());
    wrapper.setName(defaultServlet);
    context.addChild(wrapper);

    if (isListings) {
      wrapper.addInitParameter("listings", "true");
    }
    context.addServletMappingDecoded("/", defaultServlet);
    context.addWelcomeFile("index.jsp");

    var topPageServlet = "TopPageServlet";
    Tomcat.addServlet(context, topPageServlet, new TopPageServlet());
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
    Tomcat.addServlet(context, errorsServiceServletName, new ErrorsServiceServlet());
    context.addServletMappingDecoded("/errors/404", errorsServiceServletName);
    context.addServletMappingDecoded("/errors/500", errorsServiceServletName);

    var def1 = new FilterDef();
    def1.setFilter(onionLocation.map(TorFilter::new).orElseGet(TorFilter::new));
    def1.setFilterName("TorFilter");
    context.addFilterDef(def1);
    var map1 = new FilterMap();
    map1.setFilterName("TorFilter");
    map1.addURLPatternDecoded("*");
    context.addFilterMap(map1);

    context.addMimeMapping("html", "text/html");

    var valve1 = new AccessLogValve();
    valve1.setPattern("%t %a %A %v %r");
    var pipeline = tomcat.getEngine().getPipeline();
    pipeline.addValve(valve1);
    var valve2 = new ErrorReportValve();
    valve2.setShowReport(false);
    valve2.setShowServerInfo(false);
    pipeline.addValve(valve2);

    try {
      tomcat.start();
      logger.info("Tomcat server started on http://localhost:{}", port);
      tomcat.getServer().await();
    } catch (LifecycleException e) {
      throw new RuntimeException(e);
    }
  }

  @Nonnull
  private static ContextResource getJDBCContextResource(String name, String driverClassName,
      String url, String username, String password) {
    var contextResource = new ContextResource();
    contextResource.setName(name);
    contextResource.setType("javax.sql.DataSource");
    // factory を書き換えないとデフォルトのファクトリーではモジュール競合で参照不可
    contextResource.setProperty("factory", "org.apache.tomcat.jdbc.pool.DataSourceFactory");
    contextResource.setProperty("driverClassName", driverClassName);
    contextResource.setProperty("url", url);
    contextResource.setProperty("username", username);
    contextResource.setProperty("password", password);
    return contextResource;
  }
}
