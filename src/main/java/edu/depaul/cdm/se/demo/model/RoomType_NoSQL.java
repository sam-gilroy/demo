package edu.depaul.cdm.se.demo.model;


import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "roomType")
public class RoomType_NoSQL {

    private String id;

    private String roomSize;

    private boolean smoking;

    private int roomRate;

    /*
    @DBRef(db="hotel_res")
    private Hotel_NoSQL hotel = new Hotel_NoSQL();
    */

    public RoomType_NoSQL(String roomSize, boolean smoking, int roomRate) {
        this.roomRate = roomRate;
        this.roomSize = roomSize;
        this.smoking = smoking;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public int getRoomRate() {
        return roomRate;
    }

    public void setRoomRate(int roomRate) {
        this.roomRate = roomRate;
    }

    /*
    public Hotel_NoSQL getHotel() {
        return hotel;
    }

    public void setHotel(Hotel_NoSQL hotel) {
        this.hotel = hotel;
    }

     */
}
