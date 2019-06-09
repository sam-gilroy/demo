package edu.depaul.cdm.se.demo.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "position")
public class Position {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "position_Name")
    private String positionName;

    @Column (name = "salary")
    private int salary;

    @OneToMany(mappedBy = "position_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<EmployeeInfo> position_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPosition_Name() {
        return positionName;
    }

    public void setPosition_Name(String position_Name) {
        this.positionName = position_Name;
    }

    public List<EmployeeInfo> getPosition_id() {
        return position_id;
    }

    public void setPosition_id(List<EmployeeInfo> position_id) {
        this.position_id = position_id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
