package com.apress.prospring5.gw.ch11;

import com.apress.prospring5.gw.ch11.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/28/18
 * @version $Id: $
 */
public class ScheduleTaskAnnotationDemo
{
    public static void main(String[] args) throws Exception
    {
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        System.in.read();
        ctx.close();
    }
}
