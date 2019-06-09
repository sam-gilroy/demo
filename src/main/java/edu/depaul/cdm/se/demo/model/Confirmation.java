package edu.depaul.cdm.se.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;



@Data
@Entity
@Table(name = "confirmation")
public class Confirmation {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "reservation_id",nullable = false)
    private Reservation reservation_id;

    @Column(name="guest_id")
    private long guest_id;

    @Column (name = "total_Owed")
    private int total_Owed;


    @ManyToOne
    @JoinColumn(name = "room_Num_Avail")

    private Room room_Num_Avail;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Reservation getReservation_id() {
        return reservation_id;
    }

    public void setReservation_id(Reservation reservation_id) {
        this.reservation_id = reservation_id;
    }

    public long getGuest_id() {
        return guest_id;
    }

    public void setGuest_id(long guest_id) {
        this.guest_id = guest_id;
    }

    public int getTotal_Owed() {
        return total_Owed;
    }

    public void setTotal_Owed(int total_Owed) {
        this.total_Owed = total_Owed;
    }

    public Room getRoom_Num_Avail() {
        return room_Num_Avail;
    }

    public void setRoom_Num_Avail(Room room_Num_Avail) {
        this.room_Num_Avail = room_Num_Avail;
    }
}
