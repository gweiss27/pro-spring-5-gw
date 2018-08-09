package com.apress.prospring5.gw.ch11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/28/18
 * @version $Id: $
 */
@Service("asyncService")
public class AsyncServiceImpl implements AsyncService
{
    final Logger logger = LoggerFactory.getLogger(AsyncServiceImpl.class);

    @Async
    @Override
    public void asyncTask()
    {
        logger.info("Start of async. task");

        try
        {
            Thread.sleep(10000);
        }
        catch (Exception e)
        {
            logger.error("Task Interruption", e);
        }

        logger.info("Completion of async. task");
    }

    @Override
    public Future<String> asyncWithReturn(String name)
    {
        logger.info("Start of async. task with return for " + name);

        try
        {
            Thread.sleep(5000);
        }
        catch (Exception e)
        {
            logger.error("Task Interruption", e);
        }

        logger.info("Completion of async. task with return for name " + name);

        return new AsyncResult<>("Hello: " + name);
    }
}
