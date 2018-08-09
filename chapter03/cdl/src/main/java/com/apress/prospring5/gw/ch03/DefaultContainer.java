package com.apress.prospring5.gw.ch03;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/27/18
 * @version $Id: $
 */
public class DefaultContainer implements Container
{
    @Override
    public Object getDependency(String key)
    {
        if ("myDependency".equals(key))
        {
            return new Dependency();
        }

        throw new RuntimeException("Unknown dependency: " + key);
    }
}
