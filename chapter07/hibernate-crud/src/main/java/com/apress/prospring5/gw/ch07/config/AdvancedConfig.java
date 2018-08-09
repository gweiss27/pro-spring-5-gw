package com.apress.prospring5.gw.ch07.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/30/18
 * @version $Id: $
 */
@Configuration
@ComponentScan(basePackages = "com.apress.prospring5.gw.ch07")
@EnableTransactionManagement
@PropertySource("classpath:db/jdbc.properties")
public class AdvancedConfig
{
    public static final Logger logger = LoggerFactory.getLogger(AdvancedConfig.class);

    @Value("${driverClassName}")
    private String driverClassName;
    @Value("${url}")
    private String url;
    @Value("${username}")
    private String username;
    @Value("${password}")
    private String password;

    @Bean
    public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer()
    {
        return new PropertySourcesPlaceholderConfigurer();
    }

//    @Bean(destroyMethod = "close")
//    public DataSource dataSource()
//    {
//        try
//        {
//
//        }
//        catch (Exception e)
//        {
//
//        }
//    }
}
