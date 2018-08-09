package com.apress.prospring5.gw.ch11.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/28/18
 * @version $Id: $
 */
@Configuration
@EnableAsync
@ComponentScan(basePackages = {"com.apress.prospring5.gw.ch11"})
public class AppConfig
{
}
