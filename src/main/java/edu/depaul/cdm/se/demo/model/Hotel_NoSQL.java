package edu.depaul.cdm.se.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "hotel")
public class Hotel_NoSQL {

    private String id;

    private String hotelName;

    private String hotelAddress;

    public Hotel_NoSQL() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}
