package com.apress.prospring5.gw.ch03.annotated;

import com.apress.prospring5.gw.ch02.decoupled.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/27/18
 * @version $Id: $
 */
public class HelloWorldSpringAnnotated
{
    public static void main(String[] args)
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        MessageRenderer renderer = ctx.getBean("renderer", MessageRenderer.class);
        renderer.render();
    }
}
