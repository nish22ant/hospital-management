package com.hospitalmanagement.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Initializes the Dispatcher Servlet and configures it using Java-based configuration.
 * This class sets up the web application configuration and maps the Dispatcher Servlet to the root URL.
 * @author: Nishant
 */
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * Specify configuration classes with beans that will be shared across the application.
     * In this case, no root configuration is provided.
     *
     * @return An array of root configuration classes (none in this case).
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    /**
     * Specify configuration classes with beans for the Dispatcher Servlet.
     *
     * @return An array of configuration classes for the Dispatcher Servlet.
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { JavaConfig.class };
    }

    /**
     * Specify the servlet mapping(s) for the Dispatcher Servlet.
     * In this case, the Dispatcher Servlet is mapped to the root URL ("/").
     *
     * @return An array of servlet mapping(s) for the Dispatcher Servlet.
     */
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}
