package com.apress.prospring5.gw.ch02.decoupled;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/27/18
 * @version $Id: $
 */
public interface MessageRenderer
{
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
