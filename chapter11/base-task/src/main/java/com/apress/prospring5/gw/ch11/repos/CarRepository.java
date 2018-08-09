package com.apress.prospring5.gw.ch11.repos;

import com.apress.prospring5.gw.ch11.entities.Car;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/28/18
 * @version $Id: $
 */
public interface CarRepository extends CrudRepository<Car, Long>
{
}
