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

    @Column (name = "facility_Name")
    private String facilityName;

    @Column (name = "facility_Avail")
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

    public String getFacility_Name() {
        return facilityName;
    }

    public void setFacility_Name(String facility_Name) {
        this.facilityName = facility_Name;
    }

    public boolean isFacility_Avail() {
        return facilityAvail;
    }

    public void setFacility_Avail(boolean facility_Avail) {
        this.facilityAvail = facility_Avail;
    }

    public Hotel getHotel_facilities() {
        return hotel_facilities;
    }

    public void setHotel_facilities(Hotel hotel_facilities){
        this.hotel_facilities = this.hotel_facilities;
    }

}
