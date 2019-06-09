package edu.depaul.cdm.se.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "position")
public class Position {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "position_Name")
    private String position_Name;

    @Column (name = "salary")
    private int salary;

    @OneToOne (mappedBy = "position")
    private EmployeeInfo position;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPosition_Name() {
        return position_Name;
    }

    public void setPosition_Name(String position_Name) {
        this.position_Name = position_Name;
    }

    public EmployeeInfo getPosition() {
        return position;
    }

    public void setPosition(EmployeeInfo position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
