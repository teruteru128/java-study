package com.twitter.teruteru128.tomcat.launch;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.WebResourceSet;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.ContextConfig;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;
import org.apache.coyote.http11.Http11NioProtocol;

public class Main {
    public static void main(String[] args) throws Exception {
        Tomcat tomcat = new Tomcat();
        var protocol = Http11NioProtocol.class.getName();
        var connector = new Connector(protocol);
        connector.setPort(0);
        connector.setThrowOnFailure(true);
        var service = tomcat.getService();
        service.addConnector(connector);
        tomcat.setConnector(connector);
        tomcat.setBaseDir(null);
        File tempBase = new File(System.getProperty("tomcat.test.temp", "output/tmp"));
        if (!tempBase.mkdirs() && !tempBase.isDirectory()){
            return;
        }
        Path tempBasePath = FileSystems.getDefault().getPath(tempBase.getAbsolutePath());
        File tempDir = Files.createTempDirectory(tempBasePath, "test").toFile();
        File appBase = new File(tempDir, "webapps");
        tomcat.getHost().setAppBase(appBase.getAbsolutePath());
        // The port that we should run on can be set into an environment variable
        // Look for that variable and default to 8080 if it isn't there.
        var ctx = (StandardContext) tomcat.addContext("", null);
        // ctx.addLifecycleListener(tomcat.getDefaultWebXmlListener());
        var config = new ContextConfig();
        config.setDefaultWebXml(tomcat.noDefaultWebXmlPath());
        ctx.addLifecycleListener(config);
/* 
        ctx.setResources(new StandardRoot(ctx));
        var currentPath = new File("./build/classes/java/main").getAbsolutePath();
        ctx.getResources().createWebResourceSet(WebResourceRoot.ResourceSetType.POST, "/WEB-INF/classes", currentPath, null, "/");
        ctx.setAddWebinfClassesResources(true); */

        // TODO 手動で読み込ませずに、アノテーションでサーブレットを読ませるにはどうしたらいいんだ？
        //Tomcat.addServlet(ctx, "MyServlet", new HelloWorldServlet());
        //ctx.addServletMappingDecoded("/hello", "MyServlet");

        tomcat.start();
        System.out.printf("http://localhost:%d/hello", connector.getLocalPort());
        tomcat.getServer().await();
    }
}
