package com.github.teruteru128.sample;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tools.jackson.databind.ObjectMapper;

public class JacksonConfiguration implements ServletContextListener {

  private static Logger log = LoggerFactory.getLogger(JacksonConfiguration.class);
  protected final ObjectMapper mapper = new ObjectMapper();

  public JacksonConfiguration() {
  }

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    var servletContext = sce.getServletContext();
    servletContext.setAttribute("objectMapper", mapper);
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {
    var servletContext = sce.getServletContext();
    servletContext.removeAttribute("objectMapper");
  }
}
