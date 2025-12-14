package com.github.teruteru128.sample;

import com.github.teruteru128.sample.clone.CloneSample;
import com.github.teruteru128.sample.curve25519.Curve25519Sample;
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
import org.apache.catalina.session.StandardManager;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.valves.AccessLogValve;
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
    var manager = new StandardManager();
    manager.setPathname("SESSIONS.ser");
    context.setManager(manager);

    context.setRequestCharacterEncoding(StandardCharsets.UTF_8.name());
    context.setResponseCharacterEncoding(StandardCharsets.UTF_8.name());

    context.setSessionTimeout(0);

    var namingResources = context.getNamingResources();

    namingResources.addResource(getJDBCContextResource("jdbc/SQLiteDataSource", "org.sqlite.JDBC",
        "jdbc:sqlite:sample.db", "", ""));
    // postgresqlはDBサーバーがないと例外を吐くので注意
    /*namingResources.addResource(getJDBCContextResource("jdbc/PostgresDataSource",
        "org.postgresql.Driver", "jdbc:postgresql://localhost:5432/postgres", "", ""));*/

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
    context.addServletMappingDecoded("/sample/sqlite", SQLiteConnectSampleName);

    var ECKeyGenerateSampleName = "ECKeyGenerateSample";
    tomcat.addServlet(contextPath, ECKeyGenerateSampleName, new ECKeyGenerateSample());
    context.addServletMappingDecoded("/sample/ec", ECKeyGenerateSampleName);

    var curve25519SampleName = "Curve25519Sample";
    tomcat.addServlet(contextPath, curve25519SampleName, new Curve25519Sample());
    context.addServletMappingDecoded("/sample/curve25519", curve25519SampleName);

    var cloneSampleName = "CloneSample";
    tomcat.addServlet(contextPath, cloneSampleName, new CloneSample());
    context.addServletMappingDecoded("/sample/clone", cloneSampleName);

    var hashServletName = "HashServlet";
    tomcat.addServlet(contextPath, hashServletName, new HashServlet());
    context.addServletMappingDecoded("/api/hash/*", hashServletName);

    var primesListInitFilterName = "PrimesListInitFilter";
    var filter = new PrimesListInitFilter();
    var def = new FilterDef();
    def.setFilter(filter);
    def.setFilterName(primesListInitFilterName);
    context.addFilterDef(def);
    var map = new FilterMap();
    map.setFilterName(primesListInitFilterName);
    map.addURLPatternDecoded("*");
    context.addFilterMap(map);

    var primesCreateServletName = "PrimesCreateServlet";
    tomcat.addServlet(contextPath, primesCreateServletName, new PrimesCreateServlet());
    context.addServletMappingDecoded("/sample/primes/create", primesCreateServletName);

    var primesViewerServletName = "PrimesViewerServlet";
    tomcat.addServlet(contextPath, primesViewerServletName, new PrimesViewerServlet());
    context.addServletMappingDecoded("/sample/primes/viewer", primesViewerServletName);

    var primesCounterServletName = "PrimesCounterServlet";
    tomcat.addServlet(contextPath, primesCounterServletName, new PrimesCounterServlet());
    context.addServletMappingDecoded("/sample/primes/counter", primesCounterServletName);

    var primesAllDeleteServletName = "PrimesAllDeleteServlet";
    tomcat.addServlet(contextPath, primesAllDeleteServletName, new PrimesAllDeleteServlet());
    context.addServletMappingDecoded("/sample/primes/delete/all", primesAllDeleteServletName);

    var doSName = "DoSServlet";
    tomcat.addServlet(contextPath, doSName, new DoSServlet());
    context.addServletMappingDecoded("/api/dos", doSName);

    var pbkdf2ServletName = "Pbkdf2Servlet";
    tomcat.addServlet(contextPath, pbkdf2ServletName, new PBKDF2Servlet());
    context.addServletMappingDecoded("/sample/pbkdf2", pbkdf2ServletName);

    context.addMimeMapping("html", "text/html");

    var valve = new AccessLogValve();
    valve.setPattern("%t %a %A %v %r");
    tomcat.getEngine().getPipeline().addValve(valve);

    /*
    // use argon2 OR bcrypt
    var salt = new byte[16];
    var generator2 = RandomGenerator.of("SecureRandom");
    generator2.nextBytes(salt);
    var hash = new byte[64];

    var builder = new Argon2Parameters.Builder(Argon2Parameters.ARGON2_id).withIterations(1)
        .withMemoryAsKB(2097152).withParallelism(1).withSalt(salt);
    var generator = new Argon2BytesGenerator();
    generator.init(builder.build());
    long start = System.nanoTime();
    generator.generateBytes("".getBytes(StandardCharsets.UTF_8), hash);
    long end = System.nanoTime();
    System.out.println(HexFormat.of().formatHex(hash));
    System.out.println((end - start) / 1e9 + " seconds");
    */

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
