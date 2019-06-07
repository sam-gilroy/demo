package edu.depaul.cdm.se.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document (collection = "employee_info")
public class EmployeeInfo_NoSQL {
    private String id;

    private String employeeName;

    private String employeeEmail;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public EmployeeInfo_NoSQL(String employeeName, String employeeEmail) {
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
    }
}
