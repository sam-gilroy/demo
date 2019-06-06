package edu.depaul.cdm.se.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document (collection = "position")
public class Position_NoSQL {
    private String id;

    private String positionName;

    private int salary;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Position_NoSQL(String positionName, int salary) {
        this.positionName = positionName;
        this.salary = salary;
    }
}
