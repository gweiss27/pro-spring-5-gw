package com.apress.prospring5.gw.ch07.dao;

import com.apress.prospring5.gw.ch07.entities.Singer;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/30/18
 * @version $Id: $
 */
@Transactional
@Repository("singerDao")
public class SingerDaoImpl implements SingerDao
{
    public static final Logger logger = LoggerFactory.getLogger(SingerDaoImpl.class);

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }

    @Resource(name = "sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Singer> findAll()
    {
        return sessionFactory.getCurrentSession()
                .createQuery("from Singer s").list();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Singer> findAllWithAlbum()
    {
        return sessionFactory.getCurrentSession()
                .getNamedQuery("Singer.findAllWithAlbum").list();
    }

    @Override
    @Transactional(readOnly = true)
    public Singer findById(Long id)
    {
        return (Singer) sessionFactory.getCurrentSession()
                .getNamedQuery("Singer.findById")
                .setParameter("id", id).uniqueResult();
    }

    @Override
    public Singer save(Singer singer)
    {
        sessionFactory.getCurrentSession().saveOrUpdate(singer);
        logger.info("Singer saved with id: " + singer.getId());
        return singer;
    }

    @Override
    public void delete(Singer singer)
    {
        sessionFactory.getCurrentSession().delete(singer);
        logger.info("Singer deleted with id: " + singer.getId());
    }
}
