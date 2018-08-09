package com.apress.prospring5.gw.ch09;

import com.apress.prospring5.gw.ch09.config.DataJpaConfig;
import com.apress.prospring5.gw.ch09.config.ServicesConfig;
import com.apress.prospring5.gw.ch09.entities.Singer;
import com.apress.prospring5.gw.ch09.services.SingerService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.util.List;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 8/1/18
 * @version $Id: $
 */
public class TxAnnotationDemo
{
    public static void main(String[] args)
    {
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(
                ServicesConfig.class, DataJpaConfig.class);

        SingerService singerService = ctx.getBean(SingerService.class);

        List<Singer> singers = singerService.findAll();
        singers.forEach(s -> System.out.println(s));

        Singer singer = singerService.findById(1L);
        singer.setFirstName("John Clayton");
        singer.setLastName("Mayer");
        singerService.save(singer);

        System.out.println("Singer saved successfully: " + singer);
        System.out.println("Singer count: " + singerService.countAll());

        ctx.close();
    }
}
