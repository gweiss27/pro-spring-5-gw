package com.apress.prospring5.gw.ch11;

import java.util.concurrent.Future;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/28/18
 * @version $Id: $
 */
public interface AsyncService
{
    void asyncTask();
    Future<String> asyncWithReturn(String name);
}
