package com.twitter.teruteru128.tomcat.launch;

import java.time.LocalDateTime;

import org.apache.catalina.connector.Connector;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.core.StandardWrapper;
import org.apache.catalina.startup.ContextConfig;
import org.apache.catalina.startup.Tomcat;
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
        tomcat.getHost().setAppBase("work/Tomcat/localhost/");
        var ctx = (StandardContext) tomcat.addContext("", null);
        // JSPを有効にしないので使わない
        // ctx.addLifecycleListener(tomcat.getDefaultWebXmlListener());
        var config = new ContextConfig();
        config.setDefaultWebXml(tomcat.noDefaultWebXmlPath());
        ctx.addLifecycleListener(config);
        /*
        ctx.setResources(new StandardRoot(ctx));
        // ./gradlew tomcatsample:run の場合は build/classes/java/main
        // java -jar tomcatsample/build/libs/tomcatsample-shade.jar の場合は tomcatsample/build/classes/java/main
        // カレントディレクトリの都合で変わっちゃ駄目だろ、ボツ
        ctx.getResources().createWebResourceSet(WebResourceRoot.ResourceSetType.POST, 
        "/WEB-INF/classes", new File("tomcatsample/build/classes/java/main").getAbsolutePath(), null, "/");
        ctx.setAddWebinfClassesResources(true);
        */

        // TODO 手動で読み込ませずに、アノテーションでサーブレットを読ませるにはどうしたらいいんだ？
        var wrapper = new StandardWrapper();
        wrapper.setServletClass("com.twitter.teruteru128.tomcat.servlet.HelloWorldServlet");
        wrapper.setName("MyServlet");
        wrapper.addInitParameter("time", LocalDateTime.now().toString());
        ctx.addChild(wrapper);
        //Tomcat.addServlet(ctx, "MyServlet", new HelloWorldServlet());
        ctx.addServletMappingDecoded("/hello", "MyServlet");

        tomcat.start();
        System.out.printf("http://localhost:%d/hello%n", connector.getLocalPort());
        tomcat.getServer().await();
    }
}
