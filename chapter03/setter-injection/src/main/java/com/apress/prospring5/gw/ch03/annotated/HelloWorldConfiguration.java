package com.apress.prospring5.gw.ch03.annotated;

import com.apress.prospring5.gw.ch02.decoupled.MessageProvider;
import com.apress.prospring5.gw.ch02.decoupled.MessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/27/18
 * @version $Id: $
 */
@ComponentScan(basePackages = {"com.apress.prospring5.gw.ch03.annotated"})
@Configuration
public class HelloWorldConfiguration
{
    // NOT NEEDED IF COMPONENT SCANNING IS ON
//    @Bean
//    public MessageProvider provider() {
//        return new HelloWorldMessageProvider();
//    }
//
//    @Bean
//    public MessageRenderer renderer()
//    {
//        MessageRenderer renderer = new StandardOutMessageRenderer();
//        renderer.setMessageProvider(provider());
//        return renderer;
//    }
}
