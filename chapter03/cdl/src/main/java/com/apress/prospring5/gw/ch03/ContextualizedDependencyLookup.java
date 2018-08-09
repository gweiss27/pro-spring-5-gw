package com.apress.prospring5.gw.ch03;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/27/18
 * @version $Id: $
 */
public class ContextualizedDependencyLookup implements ManagedComponent
{
    private Dependency dependency;

    @Override
    public void performLookup(Container container)
    {
        this.dependency = (Dependency) container.getDependency("myDependency");
    }

    @Override
    public String toString()
    {
        return "ContextualizedDependencyLookup{" +
                "dependency=" + dependency +
                '}';
    }
}
