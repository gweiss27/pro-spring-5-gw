package com.apress.prospring5.gw.ch03.annotated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/27/18
 * @version $Id: $
 */
@Service("singer")
public class Singer
{
    @Autowired
    private Inspiration inspirationBean;

    public void sing()
    {
        System.out.println("... " + inspirationBean.getLyric());
    }
}
