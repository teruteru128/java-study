package com.github.teruteru128.sample.sql;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;

import com.github.teruteru128.sample.Sample;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import org.sqlite.SQLiteDataSource;

public class SQLiteConnectSample extends HttpServlet implements Sample {

    public SQLiteConnectSample() {
        super();
    }

    public static void sample(String url) throws SQLException {
        var dataSource = new SQLiteDataSource();
        dataSource.setUrl(url);
        try (var con = dataSource.getConnection()) {
            System.out.println("connected!");
        }
    }

    private DataSource dataSource = null;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        try {
            var initialContext = new InitialContext();
            var envContext = (Context)initialContext.lookup("java:comp/env");
            dataSource = (DataSource) envContext.lookup("jdbc/SQLiteDataSource");
        } catch (NamingException e) {
            throw new ServletException(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {

        resp.setCharacterEncoding(StandardCharsets.UTF_8);
        resp.setContentType("text/plain");
        var writer = resp.getWriter();
        try {
            try (var con = dataSource.getConnection()) {
                writer.println("Success!");
            }
        } catch (SQLException e) {
            writer.println("Fail!");
            e.printStackTrace(writer);
        }
    }

    @Override
    public void sample() throws Exception {
        sample("");
    }
}
