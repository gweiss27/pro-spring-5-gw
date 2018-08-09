package com.apress.prospring5.gw.ch06;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/30/18
 * @version $Id: $
 */
public class CleanUp
{
    private static final Logger logger = LoggerFactory.getLogger(CleanUp.class);

    private JdbcTemplate jdbcTemplate;

    public CleanUp(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate = jdbcTemplate;
    }

    private void destroy()
    {
        logger.info(" ... Deleting database files.");
        jdbcTemplate.execute("DROP ALL OBJECTS DELETE FILES");
    }
}
