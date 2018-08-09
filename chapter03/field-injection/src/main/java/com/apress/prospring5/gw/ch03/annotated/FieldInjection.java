package com.apress.prospring5.gw.ch03.annotated;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/27/18
 * @version $Id: $
 */
public class FieldInjection
{
    public static void main(String[] args)
    {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context.xml");
        ctx.refresh();

        Singer singerBean = ctx.getBean(Singer.class);
        singerBean.sing();

        ctx.close();
    }
}
