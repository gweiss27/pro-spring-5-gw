package com.apress.prospring5.gw.ch03.annotated;

import com.apress.prospring5.gw.ch02.decoupled.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

    @Autowired
    public ConfigurableMessageProvider(String message)
    {
        this.message = message;
    }

    @Override
    public String getMessage()
    {
        return this.message;
    }
}
