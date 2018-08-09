package com.apress.prospring5.gw.ch12.services.impl;

import com.apress.prospring5.gw.ch12.repos.SingerRepository;
import com.apress.prospring5.gw.ch12.services.SingerService;
import com.apress.prospring5.gw.ch12.entities.Singer;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/26/18
 * @version $Id: $
 */
@Service("singerService")
@Transactional
public class SingerServiceImpl implements SingerService
{
    @Autowired
    private SingerRepository singerRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Singer> findAll()
    {
        return Lists.newArrayList(singerRepository.findAll());
    }

    @Override
    @Transactional(readOnly = true)
    public List<Singer> findByFirstName(String firstName)
    {
        return singerRepository.findByFirstName(firstName);
    }

    @Override
    @Transactional(readOnly = true)
    public Singer findById(Long id)
    {
        return singerRepository.findById(id).get();
    }

    @Override
    @Transactional(readOnly = true)
    public Singer save(Singer singer)
    {
        return singerRepository.save(singer);
    }

    @Override
    @Transactional(readOnly = true)
    public void delete(Singer singer)
    {
        singerRepository.delete(singer);
    }
}
