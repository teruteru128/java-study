package com.twitter.teruteru128.tomcat.launch;

import java.util.logging.Logger;

import org.apache.catalina.connector.Connector;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.core.StandardHost;
import org.apache.catalina.core.StandardServer;
import org.apache.catalina.core.StandardWrapper;
import org.apache.catalina.startup.ContextConfig;
import org.apache.catalina.startup.Tomcat;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

/**
 * 
*/
public class Main {

    private static Log log = LogFactory.getFactory().getInstance(Main.class);

    /**
     * 
     * @param args
     * @throws Exception
    */
    public static void main(String[] args) throws Exception {
        var tomcat = new Tomcat();
        // tomcat.setPort(0); を呼び出すかどうかでbaseDirまわりで挙動が変わる
        tomcat.setPort(0);
        tomcat.setBaseDir(null);

        log.info(log.getClass());
        Logger logger = Logger.getLogger("name");
        log.info(logger.getClass());
        System.Logger logger2 = System.getLogger("name");
        log.info(logger2.getClass());

        // HTTPコネクタを定義
        var connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
        // tomcat.setPort(); と connector.setPort(); は両方呼び出すべき
        connector.setPort(0);
        connector.setThrowOnFailure(true);

        // tomcatにhttpコネクタを追加
        var server = (StandardServer)tomcat.getServer();
        var tomcatService = server.findService("Tomcat");
        tomcatService.addConnector(connector);
        // 追加済みなのでいらない
        //tomcat.setConnector(connector);

        ((StandardHost)tomcat.getHost()).setAppBase("work/Tomcat/localhost/");
        tomcat.enableNaming();

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
        wrapper.addInitParameter("name", "ここに何かしらの名前を入れる");
        //wrapper.addInitParameter("time", LocalDateTime.now().toString());
        ctx.addChild(wrapper);
        //Tomcat.addServlet(ctx, "MyServlet", new HelloWorldServlet());
        ctx.addServletMappingDecoded("/hello", "MyServlet");

        // TODO org.h2.jdbcx.JdbcDataSource とかをJNDIでルックアップできるように設定しておけないかな？
        //var serverNamingToken = server.getNamingToken();
        //var contextNamingToken = ctx.getNamingToken();
        //ContextBindings.bindClassLoader(server, serverNamingToken, server.getClass().getClassLoader());
        //ContextBindings.bindClassLoader(ctx, contextNamingToken, ctx.getClass().getClassLoader());

        tomcat.start();
        log.info(String.format("http://localhost:%d/hello", connector.getLocalPort()));
        tomcat.getServer().await();
    }
}
