package com.apress.prospring5.gw.ch03;

import com.apress.prospring5.gw.ch02.decoupled.MessageProvider;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/27/18
 * @version $Id: $
 */
public class DeclareSpringComponents
{
    public static void main(String[] args)
    {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
//        ctx.load("classpath:spring/app-context-xml.xml");
        ctx.load("classpath:spring/app-context-annotation.xml");
        ctx.refresh();

        MessageProvider messageProvider = ctx.getBean("provider", MessageProvider.class);
        System.out.println(messageProvider.getMessage());
    }
}
