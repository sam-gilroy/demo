package edu.depaul.cdm.se.demo.model;


import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "employee_Info")
public class EmployeeInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "name")
    private String name;

    @Column (name = "email")
    private String employee_Email;

    @OneToOne
    @JoinColumn(name = "position_id")
    private Position position_id;

    @OneToMany(mappedBy = "employee_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<Reservation> employee_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployee_Email() {
        return employee_Email;
    }

    public void setEmployee_Email(String employee_Email) {
        this.employee_Email = employee_Email;
    }

    public Position getPosition_id() {
        return position_id;
    }

    public void setPosition_id(Position position_id) {
        this.position_id = position_id;
    }

    public List<Reservation> getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(List<Reservation> employee_id) {
        this.employee_id = employee_id;
    }
}
