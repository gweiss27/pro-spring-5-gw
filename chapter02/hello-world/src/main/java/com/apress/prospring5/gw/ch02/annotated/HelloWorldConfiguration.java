package com.apress.prospring5.gw.ch02.annotated;

import com.apress.prospring5.gw.ch02.decoupled.HelloWorldMessageProvider;
import com.apress.prospring5.gw.ch02.decoupled.MessageProvider;
import com.apress.prospring5.gw.ch02.decoupled.MessageRenderer;
import com.apress.prospring5.gw.ch02.decoupled.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/27/18
 * @version $Id: $
 */
@Configuration
public class HelloWorldConfiguration
{
    // equivalent to <bean id="provider" class".." />
    @Bean
    public MessageProvider provider()
    {
        return new HelloWorldMessageProvider();
    }

    // equivalent to <bean id="renderer" class".." />
    @Bean
    public MessageRenderer renderer()
    {
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer;
    }
}
