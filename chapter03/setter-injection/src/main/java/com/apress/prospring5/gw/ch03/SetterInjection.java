package com.apress.prospring5.gw.ch03;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/27/18
 * @version $Id: $
 */
public class SetterInjection
{
    private Dependency dependency;

    public void setDependency(Dependency dependency)
    {
        this.dependency = dependency;
    }

    @Override
    public String toString()
    {
        return "SetterInjection{" +
                "dependency=" + dependency +
                '}';
    }
}
