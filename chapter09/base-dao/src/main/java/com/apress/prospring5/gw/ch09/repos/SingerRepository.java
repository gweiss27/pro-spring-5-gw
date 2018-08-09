package com.apress.prospring5.gw.ch09.repos;

import com.apress.prospring5.gw.ch09.entities.Singer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/31/18
 * @version $Id: $
 */
public interface SingerRepository extends CrudRepository<Singer, Long> {

    @Query("select count(s) from Singer s")
    Long countAllSingers();

}

