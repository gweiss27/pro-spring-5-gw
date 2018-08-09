package com.apress.prospring5.gw.ch03;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/27/18
 * @version $Id: $
 */
public class CDLDemo
{
    public static void main(String[] args)
    {
        Container container = new DefaultContainer();

        ManagedComponent managedComponent = new ContextualizedDependencyLookup();
        managedComponent.performLookup(container);

        System.out.println(managedComponent);
    }
}
