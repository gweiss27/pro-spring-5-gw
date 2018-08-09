package com.apress.prospring5.gw.ch12;

import com.apress.prospring5.gw.ch12.config.AppConfig;
import org.hornetq.api.jms.HornetQJMSClient;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/26/18
 * @version $Id: $
 */
public class JmsHornetQSample
{
    public static void main(String[] args) throws Exception
    {
        GenericApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);

        MessageSender messageSender =
                ctx.getBean("messageSender", MessageSender.class);

        for (int i = 0; i < 10; ++i)
        {
            messageSender.sendMessage("Test message: " + i);
        }

        System.in.read();
        ctx.close();
    }
}
