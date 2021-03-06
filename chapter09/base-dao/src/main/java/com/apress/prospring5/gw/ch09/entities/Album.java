package com.apress.prospring5.gw.ch09.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/31/18
 * @version $Id: $
 */
@Entity
@Table(name = "album")
public class Album implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Version
    @Column(name = "VERSION")
    private int version;

    @Column(name = "TITLE")
    private String title;

    @Temporal(TemporalType.DATE)
    @Column(name = "RELEASE_DATE")
    private Date releaseDate;

    @ManyToOne
    @JoinColumn(name = "SINGER_ID")
    private Singer singer;

    public Album() { }

    public Album(String title, Date releaseDate)
    {
        this.title = title;
        this.releaseDate = releaseDate;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public int getVersion()
    {
        return version;
    }

    public void setVersion(int version)
    {
        this.version = version;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public Date getReleaseDate()
    {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate)
    {
        this.releaseDate = releaseDate;
    }

    public Singer getSinger()
    {
        return singer;
    }

    public void setSinger(Singer singer)
    {
        this.singer = singer;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return String.format("Album - id: %d, Singer id: %d, Title: %s, Release Date: %s",
                id, singer.getId(), title, sdf.format(releaseDate));
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        Album album = (Album) o;
        if (title != null ? !title.equals(album.title) : album.title != null)
            return false;
        return releaseDate != null ? releaseDate.equals(album.releaseDate) : album.releaseDate == null;
    }

    @Override public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (releaseDate != null ? releaseDate.hashCode() : 0);
        return result;
    }
}
