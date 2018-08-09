package com.apress.prospring5.gw.ch12.config;

import com.apress.prospring5.gw.ch12.services.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/26/18
 * @version $Id: $
 */
@Configuration
public class HttpInvokerConfig
{
    @Autowired
    SingerService singerService;

    @Bean(name = "/httpInvoker/singerService")
    public HttpInvokerServiceExporter httpInvokerServiceExporter()
    {
        HttpInvokerServiceExporter invokerService =
                new HttpInvokerServiceExporter();

        invokerService.setService(singerService);
        invokerService.setServiceInterface(SingerService.class);
        return invokerService;
    }
}
