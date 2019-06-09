package edu.depaul.cdm.se.demo.model;


import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "room_type")
public class Room_Type{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "room_Size")
    private String roomSize;

    @Column (name = "smoking")
    private boolean smoking;

    @Column (name = "room_Rate")
    private Integer room_Rate;

    @ManyToOne
    @JoinColumn (name = "hotel",nullable = false)
    private Hotel hotel_rooms;

    @OneToMany (mappedBy = "room_Number_Type", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<Room> room_Number_Type;

    @OneToMany(mappedBy = "room_Type_Reserve", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Reservation> roomTypeReserve;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoom_Size() {
        return roomSize;
    }

    public void setRoom_Size(String room_Size) {
        this.roomSize = room_Size;
    }

    public boolean isSmoking() {
        return smoking;
    }

    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }

    public Integer getRoom_Rate() {
        return room_Rate;
    }

    public void setRoom_Rate(Integer room_Rate) {
        this.room_Rate = room_Rate;
    }

    public Hotel getHotel_rooms() {
        return hotel_rooms;
    }

    public void setHotel_rooms(Hotel hotel_rooms) {
        this.hotel_rooms = hotel_rooms;
    }

    public List<Room> getRoom_Number_Type() {
        return room_Number_Type;
    }

    public void setRoom_Number_Type(List<Room> room_Number_Type) {
        this.room_Number_Type = room_Number_Type;
    }

    public List<Reservation> getRoomTypeReserve() {
        return roomTypeReserve;
    }

    public void setRoomTypeReserve(List<Reservation> roomTypeReserve) {
        this.roomTypeReserve = roomTypeReserve;
    }
}



