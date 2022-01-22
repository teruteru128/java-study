package com.twitter.teruteru128.tomcat.servlet;

import java.io.IOException;

import org.apache.catalina.core.StandardWrapperFacade;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "MyServlet", urlPatterns = { "/hello" })
public class HelloWorldServlet extends HttpServlet {

    private static Log log = LogFactory.getLog(HelloWorldServlet.class);

    static {
        log.info("hello servlet world!");
    }

    public HelloWorldServlet() {
        // NOOP
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        try (ServletOutputStream out = resp.getOutputStream()) {
            out.println("hello world!");
        }
    }

    @Override
    public void init() throws ServletException {
        var facade = (StandardWrapperFacade) getServletConfig();
        // ここにクラス名とか入れてClass.forNameしてもいいんだよな……
        log.info(facade.getInitParameter("name"));
        var context = facade.getServletContext();
        log.info(context.getClass());
    }

}
