package com.apress.prospring5.gw.ch03.annotated;

import com.apress.prospring5.gw.ch02.decoupled.MessageProvider;
import com.apress.prospring5.gw.ch02.decoupled.MessageRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/27/18
 * @version $Id: $
 */
@Service("renderer")
public class StandardOutMessageRenderer implements MessageRenderer
{
    private MessageProvider messageProvider;

    @Override
    public void render()
    {
        if (messageProvider == null)
        {
            throw new RuntimeException(
                    "You must set the property messageProvider of class: " +
                            StandardOutMessageRenderer.class.getName()
            );
        }

        System.out.println(messageProvider.getMessage());
    }

    @Override
    @Autowired
    public void setMessageProvider(MessageProvider provider)
    {
        this.messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider()
    {
        return this.messageProvider;
    }
}
