package com.apress.prospring5.gw.ch11;

import com.apress.prospring5.gw.ch11.config.AppConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/28/18
 * @version $Id: $
 */
public class TaskExecutorDemo
{
    public static final Logger logger = LoggerFactory.getLogger(TaskExecutorDemo.class);

    public static void main(String[] args) throws Exception
    {
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        TaskToExecute taskToExecute = ctx.getBean(TaskToExecute.class);
        taskToExecute.executeTask();

        System.in.read();
        ctx.close();
    }
}
