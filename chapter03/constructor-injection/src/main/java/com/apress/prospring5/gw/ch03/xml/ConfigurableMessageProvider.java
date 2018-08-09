package com.apress.prospring5.gw.ch03.xml;

import com.apress.prospring5.gw.ch02.decoupled.MessageProvider;
import org.springframework.stereotype.Service;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/27/18
 * @version $Id: $
 */
@Service("provider")
public class ConfigurableMessageProvider implements MessageProvider
{
    private String message;

    public ConfigurableMessageProvider(String message)
    {
        this.message = message;
    }

    @Override
    public String getMessage()
    {
        return message;
    }
}
