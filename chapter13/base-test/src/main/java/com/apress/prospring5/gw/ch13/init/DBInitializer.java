package com.apress.prospring5.gw.ch13.init;

import com.apress.prospring5.gw.ch13.entities.Singer;
import com.apress.prospring5.gw.ch13.repos.SingerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/28/18
 * @version $Id: $
 */
@Service
public class DBInitializer
{
    public static final Logger logger = LoggerFactory.getLogger(DBInitializer.class);

    @Autowired
    private SingerRepository singerRepository;

    @PostConstruct
    public void initDB()
    {
        logger.info("Starting database initialization...");
        Singer singer = new Singer();
        singer.setFirstName("John");
        singer.setLastName("Mayer");
        singer.setBirthDate(new Date(
                (new GregorianCalendar(1977, 9, 16)).getTime().getTime()));
        singerRepository.save(singer);

        singer = new Singer();
        singer.setFirstName("Eric");
        singer.setLastName("Clapton");
        singer.setBirthDate(new Date(
                (new GregorianCalendar(1945, 2, 30)).getTime().getTime()));
        singerRepository.save(singer);

        singer = new Singer();
        singer.setFirstName("John");
        singer.setLastName("Butler");
        singer.setBirthDate(new Date(
                (new GregorianCalendar(1975, 3, 1)).getTime().getTime()));

        singerRepository.save(singer);
        logger.info("Database initialization finished.");
    }
}
