package edu.depaul.cdm.se.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@Document(collection = "facility")
public class Facility_NoSQL {
    private String id;

    private String FacilityName;

    private boolean IsFacilityAvail;


    public Facility_NoSQL(String FacilityName, boolean IsFacilityAvail ){
        this.FacilityName = FacilityName;
        this.IsFacilityAvail = IsFacilityAvail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFacultyName() {
        return FacilityName;
    }

    public void setFacilityName(String roomSize) {
        this.FacilityName = roomSize;
    }

    public boolean getIsFacilityAvail() {
        return IsFacilityAvail;
    }

    public void setIsFacilityAvail(boolean IsFacilityAvail) {
        this.IsFacilityAvail = IsFacilityAvail;
    }



}
