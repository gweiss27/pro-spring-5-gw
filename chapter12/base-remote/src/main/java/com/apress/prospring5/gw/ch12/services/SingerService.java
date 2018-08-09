package com.apress.prospring5.gw.ch12.services;

import com.apress.prospring5.gw.ch12.entities.Singer;

import java.util.List;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/26/18
 * @version $Id: $
 */
public interface SingerService
{
    List<Singer> findAll();
    List<Singer> findByFirstName(String firstName);
    Singer findById(Long id);
    Singer save(Singer singer);
    void delete(Singer singer);
}
