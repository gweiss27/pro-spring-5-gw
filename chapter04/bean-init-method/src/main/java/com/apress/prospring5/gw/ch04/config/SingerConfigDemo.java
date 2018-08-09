package com.apress.prospring5.gw.ch04.config;

import com.apress.prospring5.gw.ch04.Singer;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/27/18
 * @version $Id: $
 */
public class SingerConfigDemo
{
    @Configuration
    static class SingerConfig
    {
        @Lazy
        @Bean(initMethod = "init")
        public Singer singerOne()
        {
            Singer singer = new Singer();
            singer.setName("John Mayer");
            singer.setAge(39);
            return singer;
        }

        @Lazy
        @Bean(initMethod = "init")
        public Singer singerTwo()
        {
            Singer singer = new Singer();
            singer.setAge(72);
            return singer;
        }

        @Lazy
        @Bean(initMethod = "init")
        public Singer singerThree()
        {
            Singer singer = new Singer();
            singer.setName("John Butler");
            return singer;
        }
    }

    public static void main(String[] args)
    {
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(SingerConfig.class);

        getBean("singerOne", ctx);
        getBean("singerTwo", ctx);
        getBean("singerThree", ctx);

        ctx.close();
    }

    public static Singer getBean(String beanName, ApplicationContext ctx)
    {
        try
        {
            Singer bean = (Singer) ctx.getBean(beanName);
            System.out.println(bean);
            return bean;
        }
        catch (BeanCreationException ex)
        {
            System.out.println("An error occurred in bean configuration: " +
                    ex.getMessage());
            return null;
        }
    }
}
