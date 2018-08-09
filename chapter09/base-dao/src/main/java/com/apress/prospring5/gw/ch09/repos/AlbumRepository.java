package com.apress.prospring5.gw.ch09.repos;

import com.apress.prospring5.gw.ch09.entities.Album;
import com.apress.prospring5.gw.ch09.entities.Singer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/31/18
 * @version $Id: $
 */
public interface AlbumRepository extends JpaRepository<Album, Long>
{
    List<Album> findBySinger(Singer singer);
}
