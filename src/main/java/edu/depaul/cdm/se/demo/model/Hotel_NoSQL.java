package edu.depaul.cdm.se.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@Document(collection = "hotel")
public class Hotel_NoSQL {

    private String id;

    private String hotelName;

    private String hotelAddress;

    private List<RoomType_NoSQL> roomType;

    private List<Position_NoSQL> position;

    private List<Facility_NoSQL> facility;

    public List<Facility_NoSQL> getFacility() {
        return facility;
    }

    public void setFacility(List<Facility_NoSQL> facility) {
        this.facility = facility;
    }

    public List<Position_NoSQL> getPosition() {
        return position;
    }

    public void setPosition(List<Position_NoSQL> position) {
        this.position = position;
    }

    public List<RoomType_NoSQL> getRoomType() {
        return roomType;
    }

    public void setRoomType(List<RoomType_NoSQL> roomType) {
        this.roomType = roomType;
    }

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

    public Hotel_NoSQL(String hotelName, String hotelAddress, List<RoomType_NoSQL> roomType, List<Position_NoSQL> position, List<Facility_NoSQL> facility) {
        this.hotelName = hotelName;
        this.hotelAddress = hotelAddress;
        this.roomType = roomType;
        this.position = position;
        this.facility = facility;
    }

    @Override
    public String toString(){
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = "";

        try {
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            jsonString = mapper.writeValueAsString(this);
        }catch (JsonProcessingException e){
            e.printStackTrace();
        }

        return jsonString;
    }

}
