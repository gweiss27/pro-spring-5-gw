package com.apress.prospring5.gw.ch11;

import com.apress.prospring5.gw.ch11.config.AppConfig;
import com.apress.prospring5.gw.ch11.services.CarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/28/18
 * @version $Id: $
 */
public class ScheduleTaskDemo
{
    public static final Logger logger = LoggerFactory.getLogger(ScheduleTaskDemo.class);

    public static void main(String[] args) throws Exception
    {
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        // Fix Run: this part stops after 1 run
//        CarService carService = ctx.getBean("carService", CarService.class);
//        while(!carService.isDone())
//        {
//            logger.info("Waiting for scheduled job to end");
//            Thread.sleep(250);
//        }

        // Run until User Input Kills Run
        System.in.read();

        ctx.close();
    }
}
