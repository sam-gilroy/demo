package edu.depaul.cdm.se.demo.model;

import lombok.Data;
import lombok.ToString;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Data
@Entity
@Table(name = "availRooms")
public class Available {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "status",nullable = false)
    private Room status;

    @OneToOne
    @JoinColumn(name = "roomNumber",nullable = false, unique = true)
    private Room roomNum;

    @Column(name="departure_dt")
    private Timestamp departureDateTime;

    @Column(name="arrival_dt")
    private Timestamp arrivalDateTime;



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

    public Room getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(Room roomNum) {
        this.roomNum = roomNum;
    }

    public Timestamp getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(Timestamp departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public Timestamp getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(Timestamp arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }
}
