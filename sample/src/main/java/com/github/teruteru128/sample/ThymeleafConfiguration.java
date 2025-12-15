package com.github.teruteru128.sample;

import jakarta.annotation.Nonnull;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import java.util.logging.Logger;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;

public class ThymeleafConfiguration implements ServletContextListener {

  public static final String TEMPLATE_ENGINE_INSTANCE_KEY = "templateEngineInstance";
  private static final Logger logger = Logger.getLogger(ThymeleafConfiguration.class.getName());

  @Nonnull
  private static TemplateEngine getTemplateEngine() {
    var templateEngine = new TemplateEngine();

    var templateResolver = getTemplateResolver();
    templateEngine.setTemplateResolver(templateResolver);

    return templateEngine;
  }

  @Nonnull
  private static ITemplateResolver getTemplateResolver() {
    var templateResolver = new ClassLoaderTemplateResolver();
    templateResolver.setPrefix("com/github/teruteru128/sample/");
    templateResolver.setSuffix(".html");
    templateResolver.setTemplateMode(TemplateMode.HTML);
    templateResolver.setCharacterEncoding("UTF-8");
    templateResolver.setCacheTTLMs(3600000L);
    templateResolver.setCacheable(false);
    return templateResolver;
  }

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    var templateEngine = getTemplateEngine();
    sce.getServletContext().setAttribute(TEMPLATE_ENGINE_INSTANCE_KEY, templateEngine);
  }

}
