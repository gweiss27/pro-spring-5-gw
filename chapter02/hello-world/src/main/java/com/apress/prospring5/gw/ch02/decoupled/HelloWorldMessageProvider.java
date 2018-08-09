package com.apress.prospring5.gw.ch02.decoupled;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/27/18
 * @version $Id: $
 */
public class HelloWorldMessageProvider implements MessageProvider
{
    @Override
    public String getMessage()
    {
        return "Hello World";
    }
}
