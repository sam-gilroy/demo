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
    private String hotelAddress;

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


    public List<Facility> getHotel_facilities() {
        return hotel_facilities;
    }

    public void setHotel_rooms(List<Facility> hotel_facilities) {
        this.hotel_facilities = hotel_facilities;
    }
}
