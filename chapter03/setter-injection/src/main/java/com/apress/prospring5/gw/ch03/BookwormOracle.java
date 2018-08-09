package com.apress.prospring5.gw.ch03;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/27/18
 * @version $Id: $
 */
public class BookwormOracle implements Oracle
{
    private Encyclopedia encyclopedia;

    public void setEncyclopedia(Encyclopedia encyclopedia)
    {
        this.encyclopedia = encyclopedia;
    }

    @Override
    public String defineMeaningOfLife()
    {
        return "Encyclopedias are a waste of money - go see the world instead";
    }
}
