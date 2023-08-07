package com.hospitalmanagement.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Configuration class for managing beans related to Spring MVC and database configuration.
 * This class provides bean definitions for ViewResolver, DataSource, and JdbcTemplate.
 * @author: Nishant
 */
@EnableWebMvc
@ComponentScan(basePackages = "com")
public class JavaConfig {
    
    /**
     * Creates and configures the ViewResolver bean.
     *
     * @return The configured ViewResolver bean.
     */
    @Bean
    public ViewResolver getViewResolver() {
        return new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
    }
    
    /**
     * Creates and configures the DataSource bean for database connectivity.
     *
     * @return The configured DataSource bean.
     */
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/hospital-management");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;
    }

    /**
     * Creates and configures the JdbcTemplate bean for database operations.
     *
     * @param dataSource The DataSource bean used for database connectivity.
     * @return The configured JdbcTemplate bean.
     */
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
