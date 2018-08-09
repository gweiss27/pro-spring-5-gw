package com.apress.prospring5.gw.ch13;

import com.apress.prospring5.gw.ch13.entities.Singer;
import com.apress.prospring5.gw.ch13.entities.Singers;
import com.apress.prospring5.gw.ch13.services.SingerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/28/18
 * @version $Id: $
 */
@Controller
@RequestMapping(value="/singer")
public class SingerController
{
    public static final Logger logger = LoggerFactory.getLogger(SingerController.class);

    @Autowired
    private SingerService singerService;

    // listData()

    @RequestMapping(value = "/listdata", method = RequestMethod.GET)
    @ResponseBody
    public Singers listData()
    {
        return new Singers(singerService.findAll());
    }

    // findSingerById()
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Singer findSingerById(@PathVariable Long id)
    {
        return singerService.findById(id);
    }

    // create()
    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    public Singer create(@RequestBody Singer singer)
    {
        logger.info("Creating singer: " + singer);
        singerService.save(singer);
        logger.info("Singer created successfully with info: " + singer);
        return singer;
    }

    // update()
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public Singer update(@RequestBody Singer singer, @PathVariable Long id)
    {
        logger.info("Updating singer: " + singer);
        singerService.save(singer);
        logger.info("Singer updated successfully with info: " + singer);
        return singer;
    }

    // delete()
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable Long id)
    {
        logger.info("Deleting singer with id: " + id);
        Singer singer = singerService.findById(id);
        singerService.delete(singer);
        logger.info("Singer deleted successfully");
    }
}
