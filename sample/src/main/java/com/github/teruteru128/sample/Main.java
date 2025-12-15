package com.github.teruteru128.sample;

import com.github.teruteru128.sample.aes.AESSample;
import com.github.teruteru128.sample.clone.CloneSample;
import com.github.teruteru128.sample.curve25519.Curve25519Sample;
import com.github.teruteru128.sample.dist.AnyDistributionSample;
import com.github.teruteru128.sample.dist.LogNormalDistributionSample;
import com.github.teruteru128.sample.dynamic.DynamicServiceServlet;
import com.github.teruteru128.sample.ec.ECKeyGenerateSample;
import com.github.teruteru128.sample.forward.FooterIncludeServlet;
import com.github.teruteru128.sample.forward.ForwardStep1Servlet;
import com.github.teruteru128.sample.forward.ForwardStep2Servlet;
import com.github.teruteru128.sample.forward.HeaderIncludeServlet;
import com.github.teruteru128.sample.kdf.PBKDF2Servlet;
import com.github.teruteru128.sample.primes.PrimesAllDeleteServlet;
import com.github.teruteru128.sample.primes.PrimesCounterServlet;
import com.github.teruteru128.sample.primes.PrimesCreateServlet;
import com.github.teruteru128.sample.primes.PrimesListInitFilter;
import com.github.teruteru128.sample.primes.PrimesViewerServlet;
import com.github.teruteru128.sample.sql.SQLiteConnectSample;
import jakarta.annotation.Nonnull;
import jakarta.servlet.http.HttpServletResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.security.Security;
import java.util.logging.Logger;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.servlets.DefaultServlet;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.valves.AccessLogValve;
import org.apache.catalina.webresources.StandardRoot;
import org.apache.tomcat.util.descriptor.web.ContextResource;
import org.apache.tomcat.util.descriptor.web.ErrorPage;
import org.apache.tomcat.util.descriptor.web.FilterDef;
import org.apache.tomcat.util.descriptor.web.FilterMap;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class Main {

  private static final Logger logger = Logger.getLogger(Main.class.getName());

  public static void main(String[] args) {
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
    var docBase = Path.of("web").toAbsolutePath().toString();
    logger.info("docBase: " + docBase);
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
    root.setCacheMaxSize(1024 * 1024);
    root.setAllowLinking(true);
    context.setResources(root);

    var namingResources = context.getNamingResources();

    namingResources.addResource(
        getJDBCContextResource("jdbc/SQLiteDataSource", "org.sqlite.JDBC", "jdbc:sqlite:sample.db",
            "", ""));
    // postgresqlはDBサーバーがないと例外を吐くので注意
    /*namingResources.addResource(getJDBCContextResource("jdbc/PostgresDataSource",
        "org.postgresql.Driver", "jdbc:postgresql://localhost:5432/postgres", "", ""));*/

    var defaultServlet = "DefaultServlet";
    var wrapper = Tomcat.addServlet(context, defaultServlet, new DefaultServlet());
    wrapper.addInitParameter("listings", "true");
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

    var dynamicServletName = "DynamicServiceServlet";
    Tomcat.addServlet(context, dynamicServletName, new DynamicServiceServlet());
    context.addServletMappingDecoded("/api/hello", dynamicServletName);

    var forwardStep1ServletName = "ForwardStep1Servlet";
    Tomcat.addServlet(context, forwardStep1ServletName, new ForwardStep1Servlet());
    context.addServletMappingDecoded("/api/forward1", forwardStep1ServletName);

    var forwardStep2ServletName = "ForwardStep2Servlet";
    Tomcat.addServlet(context, forwardStep2ServletName, new ForwardStep2Servlet());
    context.addServletMappingDecoded("/api/forward2", forwardStep2ServletName);

    var headerServletName = "HeaderServlet";
    Tomcat.addServlet(context, headerServletName, new HeaderIncludeServlet());
    context.addServletMappingDecoded("/api/header", headerServletName);

    var footerServletName = "FooterServlet";
    Tomcat.addServlet(context, footerServletName, new FooterIncludeServlet());
    context.addServletMappingDecoded("/api/footer", footerServletName);

    var SQLiteConnectSampleName = "SQLiteConnectSample";
    Tomcat.addServlet(context, SQLiteConnectSampleName, new SQLiteConnectSample());
    context.addServletMappingDecoded("/sample/sqlite", SQLiteConnectSampleName);

    var ECKeyGenerateSampleName = "ECKeyGenerateSample";
    Tomcat.addServlet(context, ECKeyGenerateSampleName, new ECKeyGenerateSample());
    context.addServletMappingDecoded("/sample/ec", ECKeyGenerateSampleName);

    var curve25519SampleName = "Curve25519Sample";
    Tomcat.addServlet(context, curve25519SampleName, new Curve25519Sample());
    context.addServletMappingDecoded("/sample/curve25519", curve25519SampleName);

    var cloneSampleName = "CloneSample";
    Tomcat.addServlet(context, cloneSampleName, new CloneSample());
    context.addServletMappingDecoded("/sample/clone", cloneSampleName);

    var hashServletName = "HashServlet";
    Tomcat.addServlet(context, hashServletName, new HashServlet());
    context.addServletMappingDecoded("/api/hash/*", hashServletName);

    var primesListInitFilterName = "PrimesListInitFilter";
    var primesListInitFilter = new PrimesListInitFilter();
    var def = new FilterDef();
    def.setFilter(primesListInitFilter);
    def.setFilterName(primesListInitFilterName);
    context.addFilterDef(def);
    var map = new FilterMap();
    map.setFilterName(primesListInitFilterName);
    map.addURLPatternDecoded("*");
    context.addFilterMap(map);

    var primesCreateServletName = "PrimesCreateServlet";
    Tomcat.addServlet(context, primesCreateServletName, new PrimesCreateServlet());
    context.addServletMappingDecoded("/sample/primes/create", primesCreateServletName);

    var primesViewerServletName = "PrimesViewerServlet";
    Tomcat.addServlet(context, primesViewerServletName, new PrimesViewerServlet());
    context.addServletMappingDecoded("/sample/primes/viewer", primesViewerServletName);

    var primesCounterServletName = "PrimesCounterServlet";
    Tomcat.addServlet(context, primesCounterServletName, new PrimesCounterServlet());
    context.addServletMappingDecoded("/sample/primes/counter", primesCounterServletName);

    var primesAllDeleteServletName = "PrimesAllDeleteServlet";
    Tomcat.addServlet(context, primesAllDeleteServletName, new PrimesAllDeleteServlet());
    context.addServletMappingDecoded("/sample/primes/delete/all", primesAllDeleteServletName);

    var registerServletName = "RegisterServlet";
    Tomcat.addServlet(context, registerServletName, new RegisterServlet());
    context.addServletMappingDecoded("/user/register", registerServletName);

    var loginServletName = "LoginServlet";
    Tomcat.addServlet(context, loginServletName, new LogInServlet());
    context.addServletMappingDecoded("/user/login", loginServletName);

    var userBeanFilterName = "UserBeanFilter";
    var userBeanFilter = new UserBeanFilter();
    var def1 = new FilterDef();
    def1.setFilter(userBeanFilter);
    def1.setFilterName(userBeanFilterName);
    context.addFilterDef(def1);
    var map1 = new FilterMap();
    map1.setFilterName(userBeanFilterName);
    map1.addURLPatternDecoded("*");
    context.addFilterMap(map1);

    var doSName = "DoSServlet";
    Tomcat.addServlet(context, doSName, new DoSServlet());
    context.addServletMappingDecoded("/api/dos", doSName);

    var pbkdf2ServletName = "Pbkdf2Servlet";
    Tomcat.addServlet(context, pbkdf2ServletName, new PBKDF2Servlet());
    context.addServletMappingDecoded("/sample/pbkdf2", pbkdf2ServletName);

    var anyDistributionSampleServletName = "AnyDistributionSample";
    Tomcat.addServlet(context, anyDistributionSampleServletName, new AnyDistributionSample());
    context.addServletMappingDecoded("/sample/any", anyDistributionSampleServletName);

    var logNormalDistributionSampleServletName = "logNormalDistributionSampleServlet";
    tomcat.addServlet(contextPath, logNormalDistributionSampleServletName,
        new LogNormalDistributionSample());
    context.addServletMappingDecoded("/sample/logNormal", logNormalDistributionSampleServletName);

    var aesSampleServletName = "AESSample";
    Tomcat.addServlet(context, aesSampleServletName, new AESSample());
    context.addServletMappingDecoded("/sample/aes", aesSampleServletName);

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
