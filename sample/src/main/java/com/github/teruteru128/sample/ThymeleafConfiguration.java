package com.github.teruteru128.sample;

import jakarta.annotation.Nonnull;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import java.util.logging.Logger;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.WebApplicationTemplateResolver;
import org.thymeleaf.web.servlet.JakartaServletWebApplication;

public class ThymeleafConfiguration implements ServletContextListener {

  public static final String TEMPLATE_ENGINE_INSTANCE_KEY = "templateEngineInstance";
  private static final Logger logger = Logger.getLogger(ThymeleafConfiguration.class.getName());

  @Nonnull
  private static TemplateEngine getTemplateEngine(JakartaServletWebApplication application) {
    var templateEngine = new TemplateEngine();

    var templateResolver = getTemplateResolver(application);
    templateEngine.setTemplateResolver(templateResolver);

    return templateEngine;
  }

  @Nonnull
  private static WebApplicationTemplateResolver getTemplateResolver(
      JakartaServletWebApplication application) {
    var templateResolver = new WebApplicationTemplateResolver(application);
    templateResolver.setPrefix("templates/");
    templateResolver.setSuffix(".html");
    templateResolver.setTemplateMode(TemplateMode.HTML);
    templateResolver.setCharacterEncoding("UTF-8");
    templateResolver.setCacheTTLMs(3600000L);
    templateResolver.setCacheable(false);
    return templateResolver;
  }

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    var application = JakartaServletWebApplication.buildApplication(sce.getServletContext());
    var templateEngine = getTemplateEngine(application);
    sce.getServletContext().setAttribute(TEMPLATE_ENGINE_INSTANCE_KEY, templateEngine);
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {
  }
}
