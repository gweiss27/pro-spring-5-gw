package com.apress.prospring5.gw.ch11.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/28/18
 * @version $Id: $
 */
@Configuration
@Import(DataServiceConfig.class)
@EnableScheduling
public class AppConfig
{
    // decomment this to use the TaskScheduler explicitly declared bean
	/*
	@Bean TaskScheduler carScheduler() {
		ThreadPoolTaskScheduler carScheduler = new ThreadPoolTaskScheduler();
		carScheduler.setPoolSize(10);
		return carScheduler;
	}
	*/
}
