package com.github.teruteru128.sample;

import jakarta.annotation.Nonnull;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import java.util.logging.Logger;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;
import org.thymeleaf.web.servlet.JakartaServletWebApplication;

public class ThymeleafConfiguration implements ServletContextListener {

  public static final String TEMPLATE_ENGINE_INSTANCE_KEY = "templateEngineInstance";
  public static final String THYMELEAF_APPLICATION_INSTANCE_KEY = "thymeleafApplicationInstance";
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
    templateResolver.setPrefix("com/github/teruteru128/sample/templates/");
    templateResolver.setSuffix(".html");
    templateResolver.setTemplateMode(TemplateMode.HTML);
    templateResolver.setCharacterEncoding("UTF-8");
    templateResolver.setCacheTTLMs(3600000L);
    templateResolver.setCacheable(false);
    return templateResolver;
  }

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    // ThymeleafApplicationをビルドし、ServletContextに保存
    var application = JakartaServletWebApplication.buildApplication(sce.getServletContext());
    sce.getServletContext().setAttribute(THYMELEAF_APPLICATION_INSTANCE_KEY, application);
    // TemplateEngineをビルドし、ServletContextに保存
    var templateEngine = getTemplateEngine();
    sce.getServletContext().setAttribute(TEMPLATE_ENGINE_INSTANCE_KEY, templateEngine);
  }

}
