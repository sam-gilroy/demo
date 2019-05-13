package edu.depaul.cdm.se.demo.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Hotel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn (name = "facility",nullable = false)
    private Facility facility;

    @ManyToOne
    @JoinColumn (name = "roomType",nullable = false)
    private RoomType roomType;

    @Column (name = "name")
    private String hotelName;

    @Column (name = "address")
    private String hotelAddress;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility){
        this.facility = this.facility;
    }
}
