package com.apress.prospring5.gw.ch07.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 7/30/18
 * @version $Id: $
 */
@Entity
@Table(name = "instrument")
public class Instrument implements Serializable
{
    private String instrumentId;

    private Set<Singer> singers = new HashSet<>();

    @Id
    @Column(name = "INSTRUMENT_ID")
    public String getInstrumentId()
    {
        return instrumentId;
    }

    public void setInstrumentId(String instrumentId)
    {
        this.instrumentId = instrumentId;
    }

    @ManyToMany
    @JoinTable(
            name = "singer_instrument"
            , joinColumns = @JoinColumn(name = "INSTRUMENT_ID")
            , inverseJoinColumns = @JoinColumn(name = "SINGER_ID")
    )
    public Set<Singer> getSingers()
    {
        return singers;
    }

    public void setSingers(Set<Singer> singers)
    {
        this.singers = singers;
    }

    @Override
    public String toString()
    {
        return "Instrument{" +
                "instrumentId='" + instrumentId + '\'' +
                '}';
    }
}
