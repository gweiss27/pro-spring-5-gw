package com.apress.prospring5.gw.ch13.repos;

import com.apress.prospring5.gw.ch13.entities.Singer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/28/18
 * @version $Id: $
 */
public interface SingerRepository extends CrudRepository<Singer, Long>
{
    List<Singer> findByFirstName(String firstName);
    Singer findByFirstNameAndLastName(String firstName, String lastName);
}
