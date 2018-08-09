package com.apress.prospring5.gw.ch03.annotated;

import com.apress.prospring5.gw.ch02.decoupled.MessageProvider;
import org.springframework.stereotype.Component;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/27/18
 * @version $Id: $
 */
@Component("provider")
public class HelloWorldMessageProvider implements MessageProvider
{
    @Override
    public String getMessage()
    {
        return "Hello World!";
    }
}
