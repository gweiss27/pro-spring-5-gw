package com.apress.prospring5.gw.ch07.dao;

import com.apress.prospring5.gw.ch07.entities.Singer;

import java.util.List;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/30/18
 * @version $Id: $
 */
public interface SingerDao
{
    List<Singer> findAll();
    List<Singer> findAllWithAlbum();
    Singer findById(Long id);
    Singer save(Singer singer);
    void delete(Singer singer);
}
