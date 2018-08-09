package com.apress.prospring5.gw.ch03;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/27/18
 * @version $Id: $
 */
public class ConstructorInjection
{
    private Dependency dependency;

    public ConstructorInjection(Dependency dependency)
    {
        this.dependency = dependency;
    }

    @Override
    public String toString()
    {
        return "ConstructorInjection{" +
                "dependency=" + dependency +
                '}';
    }
}
