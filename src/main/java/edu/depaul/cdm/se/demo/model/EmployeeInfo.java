package edu.depaul.cdm.se.demo.model;


import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "employeeInfo")
public class EmployeeInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "name")
    private String employeeName;

    @Column (name = "email")
    private String employeeEmail;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn (unique = true)
    private Position position;

    @OneToMany(mappedBy = "employee_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<Reservation> employee_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public List<Reservation> getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(List<Reservation> employee_id) {
        this.employee_id = employee_id;
    }
}
