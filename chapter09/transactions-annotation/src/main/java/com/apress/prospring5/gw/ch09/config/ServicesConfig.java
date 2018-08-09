package com.apress.prospring5.gw.ch09.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 8/1/18
 * @version $Id: $
 */
@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.apress.prospring5.gw.ch09"})
public class ServicesConfig
{
    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Bean
    public PlatformTransactionManager transactionManager()
    {
        return new JpaTransactionManager(entityManagerFactory);
    }
}
