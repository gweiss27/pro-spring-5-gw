package com.apress.prospring5.gw.ch11.services;

import com.apress.prospring5.gw.ch11.entities.Car;

import java.util.List;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/28/18
 * @version $Id: $
 */
public interface CarService
{
    List<Car> findAll();
    Car save(Car car);
    void updateCarAgeJob();
    boolean isDone();
}
