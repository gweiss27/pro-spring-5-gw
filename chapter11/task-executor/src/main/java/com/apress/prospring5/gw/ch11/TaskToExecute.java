package com.apress.prospring5.gw.ch11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Component;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/28/18
 * @version $Id: $
 */
@Component
public class TaskToExecute
{
    public static final Logger logger = LoggerFactory.getLogger(TaskToExecute.class);

    @Autowired
    private TaskExecutor taskExecutor;

    public void executeTask()
    {
        for (int i = 0; i < 10; ++i)
        {
            taskExecutor.execute(() ->
                    logger.info("Hello from thread: " +
                            Thread.currentThread().getName()));
        }
    }
}
