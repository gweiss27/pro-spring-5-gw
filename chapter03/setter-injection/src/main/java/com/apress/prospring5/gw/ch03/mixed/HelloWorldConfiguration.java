package com.apress.prospring5.gw.ch03.mixed;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/27/18
 * @version $Id: $
 */
@ImportResource(locations = {"classpath:spring/app-context-xml.xml"})
@Configuration
public class HelloWorldConfiguration
{
}
