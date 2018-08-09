package com.apress.prospring5.gw.ch12.repos;

import com.apress.prospring5.gw.ch12.entities.Singer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/26/18
 * @version $Id: $
 */
public interface SingerRepository extends CrudRepository<Singer, Long>
{
    List<Singer> findByFirstName(String firstName);
}
