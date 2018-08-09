package com.apress.prospring5.gw.ch11;

import com.apress.prospring5.gw.ch11.config.AppConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.util.concurrent.Future;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/28/18
 * @version $Id: $
 */
public class AsyncTaskDemo
{
    public static final Logger logger = LoggerFactory.getLogger(AsyncTaskDemo.class);

    public static void main(String[] args) throws Exception
    {
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        AsyncService asyncService = ctx.getBean("asyncService", AsyncService.class);

        for (int i = 0; i < 5; i++)
        {
            asyncService.asyncTask();
        }

        Future<String> result1 = asyncService.asyncWithReturn("John Mayer");
        Future<String> result2 = asyncService.asyncWithReturn("Eric Clapton");
        Future<String> result3 = asyncService.asyncWithReturn("BB King");

        Thread.sleep(6000);

        logger.info("Result1 : " + result1.get());
        logger.info("Result2 : " + result2.get());
        logger.info("Result3 : " + result3.get());

        System.in.read();
        ctx.close();
    }
}
