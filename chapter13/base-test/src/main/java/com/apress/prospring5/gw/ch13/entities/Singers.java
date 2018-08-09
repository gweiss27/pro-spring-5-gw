package com.apress.prospring5.gw.ch13.entities;

import java.io.Serializable;
import java.util.List;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/28/18
 * @version $Id: $
 */
public class Singers implements Serializable
{
    private List<Singer> singers;

    public Singers() { }

    public Singers(List<Singer> singers)
    {
        this.singers = singers;
    }

    public List<Singer> getSingers()
    {
        return singers;
    }

    public void setSingers(List<Singer> singers)
    {
        this.singers = singers;
    }
}
