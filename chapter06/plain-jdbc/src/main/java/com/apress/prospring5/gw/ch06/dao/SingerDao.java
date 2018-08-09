package com.apress.prospring5.gw.ch06.dao;

import com.apress.prospring5.gw.ch06.entities.Singer;

import java.util.List;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/30/18
 * @version $Id: $
 */
public interface SingerDao
{
    List<Singer> findAll();

    List<Singer> findByFirstName(String firstName);

    String findNameById(Long id);

    String findLastNameById(Long id);

    String findFirstNameById(Long id);

    void insert(Singer singer);

    void update(Singer singer);

    void delete(Long singerId);

    List<Singer> findAllWithAlbums();

    void insertWithAlbum(Singer singer);
}
