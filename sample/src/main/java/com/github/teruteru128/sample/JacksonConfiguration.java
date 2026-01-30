package com.github.teruteru128.sample;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import tools.jackson.databind.ObjectMapper;

public class JacksonConfiguration implements ServletContextListener {

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    var servletContext = sce.getServletContext();
    servletContext.setAttribute("objectMapper", new ObjectMapper());
  }
}
