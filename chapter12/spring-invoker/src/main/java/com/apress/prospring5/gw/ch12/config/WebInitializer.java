package com.apress.prospring5.gw.ch12.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/26/18
 * @version $Id: $
 */
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{
    @Override
    protected Class<?>[] getRootConfigClasses()
    {
        return new Class<?>[]{
                DataServiceConfig.class
        };
    }

    @Override
    protected Class<?>[] getServletConfigClasses()
    {
        return new Class<?>[]{
                HttpInvokerConfig.class, WebConfig.class
        };
    }

    @Override
    protected String[] getServletMappings()
    {
        return new String[]{"/invoker/*"};
    }
}
