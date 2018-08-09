package com.apress.prospring5.gw.ch02.decoupled;

import java.util.Properties;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/27/18
 * @version $Id: $
 */
public class MessageSupportFactory
{
    private static MessageSupportFactory instance;

    private Properties props;
    private MessageRenderer renderer;
    private MessageProvider provider;

    static {
        instance = new MessageSupportFactory();
    }

    private MessageSupportFactory()
    {
        props = new Properties();

        try
        {
            props.load(this.getClass().getResourceAsStream("/msf.properties"));

            String rendererClass = props.getProperty("renderer.class");
            String providerClass = props.getProperty("provider.class");

            renderer = (MessageRenderer) Class.forName(rendererClass).newInstance();
            provider = (MessageProvider) Class.forName(providerClass).newInstance();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public static MessageSupportFactory getInstance()
    {
        return instance;
    }

    public MessageRenderer getMessageRenderer()
    {
        return renderer;
    }

    public MessageProvider getMessageProvider()
    {
        return provider;
    }

}
