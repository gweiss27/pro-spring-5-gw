package com.apress.prospring5.gw.ch07;

import com.apress.prospring5.gw.ch07.config.AppConfig;
import com.apress.prospring5.gw.ch07.entities.Album;
import com.apress.prospring5.gw.ch07.entities.Instrument;
import com.apress.prospring5.gw.ch07.entities.Singer;
import com.apress.prospring5.gw.ch07.dao.SingerDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.util.List;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/30/18
 * @version $Id: $
 */
public class SpringHibernateDemo
{
    public static final Logger logger = LoggerFactory.getLogger(SpringHibernateDemo.class);

    public static void main(String[] args)
    {
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        SingerDao singerDao = ctx.getBean(SingerDao.class);
        Singer singer = singerDao.findById(2l);
        logger.info(singer.toString());
        singerDao.delete(singer);

        //listSingers(singerDao.findAll());

        listSingersWithAlbum(singerDao.findAllWithAlbum());

        ctx.close();
    }

    private static void listSingers(List<Singer> singers)
    {
        logger.info(" --- Listing singers:");
        for (Singer singer : singers)
        {
            logger.info(singer.toString());
        }
    }

    private static void listSingersWithAlbum(List<Singer> singers)
    {
        logger.info(" --- Listing singers with instruments:");
        for (Singer singer : singers)
        {
            logger.info(singer.toString());
            if (singer.getAlbums() != null)
            {
                for (Album album : singer.getAlbums())
                {
                    logger.info("\t" + album.toString());
                }
            }
            if (singer.getInstruments() != null)
            {
                for (Instrument instrument : singer.getInstruments())
                {
                    logger.info("\t" + instrument.getInstrumentId());
                }
            }
        }
    }
}
