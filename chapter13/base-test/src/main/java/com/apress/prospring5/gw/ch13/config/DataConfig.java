package com.apress.prospring5.gw.ch13.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/28/18
 * @version $Id: $
 */
@Configuration
@Profile("dev")
@ComponentScan(basePackages = {"com.apress.prospring5.gw.ch13.init"})
public class DataConfig
{
    private static Logger logger = LoggerFactory.getLogger(DataConfig.class);

    @Bean
    public DataSource dataSource()
    {
        try
        {
            EmbeddedDatabaseBuilder databaseBuilder = new EmbeddedDatabaseBuilder();
            return databaseBuilder.setType(EmbeddedDatabaseType.H2).build();
        }
        catch (Exception e)
        {
            logger.error("Embedded Datasource cannot be created!", e);
            return null;
        }
    }
}
