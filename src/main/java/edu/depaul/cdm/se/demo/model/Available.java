package edu.depaul.cdm.se.demo.model;

import lombok.Data;
import lombok.ToString;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Data
@Entity
@Table(name = "available")
public class Available {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "status",nullable = false)
    private Room status;

    @OneToOne
    @JoinColumn(name = "room_Number",nullable = false, unique = true)
    private Room roomNum;

    @Column(name="departure_dt")
    private Timestamp departure_Date_Time;

    @Column(name="arrival_dt")
    private Timestamp arrival_Date_Time;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Room getStatus() {
        return status;
    }

    public void setStatus(Room status) {
        this.status = status;
    }

    public Room getRoom_Num() {
        return roomNum;
    }

    public void setRoom_Num(Room room_Num) {
        this.roomNum = room_Num;
    }

    public Timestamp getDeparture_Date_Time() {
        return departure_Date_Time;
    }

    public void setDeparture_Date_Time(Timestamp departure_Date_Time) {
        this.departure_Date_Time = departure_Date_Time;
    }

    public Timestamp getArrival_Date_Time() {
        return arrival_Date_Time;
    }

    public void setArrival_Date_Time(Timestamp arrival_Date_Time) {
        this.arrival_Date_Time = arrival_Date_Time;
    }
}
