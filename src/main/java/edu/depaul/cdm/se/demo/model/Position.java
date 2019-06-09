package edu.depaul.cdm.se.demo.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name = "position")
public class Position {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "positionName")
    private String positionName;

    @Column (name = "salary")
    private int salary;

    @OneToOne(mappedBy = "position_id", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private EmployeeInfo position_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public EmployeeInfo getPosition_id() {
        return position_id;
    }

    public void setPosition_id(EmployeeInfo position_id) {
        this.position_id = position_id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
