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

    @Column (name = "roomSize")
    private String roomSize;

    @Column (name = "smoking")
    private boolean smoking;

    @Column (name = "roomRate")
    private Integer roomRate;

    @ManyToOne
    @JoinColumn (name = "hotel",nullable = false)
    private Hotel hotel_rooms;

    @OneToMany (mappedBy = "room_Number_Type", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<Room> room_Number_Type;

    @OneToMany(mappedBy = "roomTypeReserve", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Reservation> roomTypeReserve;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(String roomSize) {
        this.roomSize = roomSize;
    }

    public boolean isSmoking() {
        return smoking;
    }

    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }

    public Integer getRoomRate() {
        return roomRate;
    }

    public void setRoomRate(Integer roomRate) {
        this.roomRate = roomRate;
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



