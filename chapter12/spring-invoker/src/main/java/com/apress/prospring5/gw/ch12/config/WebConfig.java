package com.apress.prospring5.gw.ch12.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/26/18
 * @version $Id: $
 */
@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer
{
}
