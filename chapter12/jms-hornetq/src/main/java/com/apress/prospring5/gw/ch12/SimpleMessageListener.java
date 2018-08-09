package com.apress.prospring5.gw.ch12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/26/18
 * @version $Id: $
 */
@Component("messageListener")
public class SimpleMessageListener
{
    private static final Logger logger = LoggerFactory.getLogger(SimpleMessageListener.class);

    @JmsListener(destination = "prospring5", containerFactory = "jmsListenerContainerFactory")
    public void onMessage(Message message)
    {
        TextMessage textMessage = (TextMessage) message;

        try
        {
            logger.info(">>> Received: " + textMessage.getText());
        }
        catch (JMSException ex)
        {
            logger.error("JMS Error", ex);
        }
    }
}
