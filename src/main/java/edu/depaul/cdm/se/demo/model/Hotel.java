package edu.depaul.cdm.se.demo.model;

import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table (name = "hotels")
public class Hotel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "hotel_rooms", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<RoomType> hotel_rooms;

    @OneToMany(mappedBy = "hotel_facilities", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<Facility> hotel_facilities;

    @Column (name = "name")
    private String hotelName;

    @Column (name = "address")
    private String hotel_Address;

    @OneToMany(mappedBy = "hotel_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<Reservation> hotel_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<RoomType> getHotel_rooms() {
        return hotel_rooms;
    }

    public void setHotel_facilities(List<Facility> hotel_facilities) {
        this.hotel_facilities = hotel_facilities;
    }

    public List<Reservation> getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(List<Reservation> hotel_id) {
        this.hotel_id = hotel_id;
    }

    public List<RoomType> gethotel_rooms() {
        return hotel_rooms;
    }

    public void sethotel_rooms(List<RoomType> hotel_rooms) {
        this.hotel_rooms = hotel_rooms;
    }

    public String getHotel_Name() {
        return hotelName;
    }

    public void setHotel_Name(String hotel_Name) {
        this.hotelName = hotel_Name;
    }

    public String getHotel_Address() {
        return hotel_Address;
    }

    public void setHotel_Address(String hotel_Address) {
        this.hotel_Address = hotel_Address;
    }


    public List<Facility> getHotel_facilities() {
        return hotel_facilities;
    }

    public void setHotel_rooms(List<Facility> hotel_facilities) {
        this.hotel_facilities = hotel_facilities;
    }
}
