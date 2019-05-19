package edu.depaul.cdm.se.demo.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
@Entity
@Table (name = "Facility")
public class Facility{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "facilityName")
    private String facilityName;

    @Column (name = "facilityAvail")
    private boolean facilityAvail;

    @ManyToOne
    @JoinColumn (name = "hotel",nullable = false)
    private Hotel hotel_facilities;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public boolean isFacilityAvail() {
        return facilityAvail;
    }

    public void setFacilityAvail(boolean facilityAvail) {
        this.facilityAvail = facilityAvail;
    }

    public Hotel getHotel_facilities() {
        return hotel_facilities;
    }

    public void setHotel_facilities(Hotel hotel_facilities){
        this.hotel_facilities = this.hotel_facilities;
    }

}