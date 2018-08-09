package com.apress.prospring5.gw.ch11.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/28/18
 * @version $Id: $
 */
@Configuration
@Import(DataServiceConfig.class)
@ImportResource("classpath:spring/task-namespace-app-context.xml")
public class AppConfig
{

}
