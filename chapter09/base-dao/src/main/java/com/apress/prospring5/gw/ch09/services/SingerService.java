package com.apress.prospring5.gw.ch09.services;

import com.apress.prospring5.gw.ch09.entities.Singer;

import java.util.List;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/31/18
 * @version $Id: $
 */
public interface SingerService
{
    List<Singer> findAll();
    Singer findById(Long id);
    Singer save(Singer singer);
    long countAll();
}
