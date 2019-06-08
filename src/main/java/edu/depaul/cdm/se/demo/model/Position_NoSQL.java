package edu.depaul.cdm.se.demo.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document (collection = "position")
public class Position_NoSQL {
    private String id;

    private String positionName;

    private int salary;

    private List<EmployeeInfo_NoSQL> employeeInfo;

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

    public List<EmployeeInfo_NoSQL> getEmployeeInfo() {
        return employeeInfo;
    }

    public void setEmployeeInfo(List<EmployeeInfo_NoSQL> employeeInfo) {
        this.employeeInfo = employeeInfo;
    }

    public Position_NoSQL(String positionName, int salary, List<EmployeeInfo_NoSQL> employeeInfo) {
        this.positionName = positionName;
        this.salary = salary;
        this.employeeInfo = employeeInfo;
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
