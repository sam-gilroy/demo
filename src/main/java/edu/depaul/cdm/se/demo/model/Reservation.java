package edu.depaul.cdm.se.demo.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "reservation")
public class Reservation {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn (name = "guest_id",nullable = false)
    private Guest guest_id;

    @Column(name="date_In")
    private String date_In;

    @Column(name="date_Out")
    private String date_Out;

    @OneToOne
    @JoinColumn(name = "room_Type_Reserve",nullable = false)
    private Room_Type room_Type_Reserve;

    @Column (name = "amount_Total")
    private int amount_Total;

    @ManyToOne
    @JoinColumn (name = "employee_id",nullable = true)
    private EmployeeInfo employee_id;

    @ManyToOne
    @JoinColumn (name = "hotel_id",nullable = true)
    private Hotel hotel_id;

    @OneToMany(mappedBy = "reservation_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<Confirmation> reservation_id;

    public Long getId() {
        return id;
    }

    public List<Confirmation> getReservation_id() {
        return reservation_id;
    }

    public void setReservation_id(List<Confirmation> reservation_id) {
        this.reservation_id = reservation_id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Guest getGuest_id() {
        return guest_id;
    }

    public void setGuest_id(Guest guest_id) {
        this.guest_id = guest_id;
    }

    public String getDate_In() {
        return date_In;
    }

    public void setDate_In(String date_In) {
        this.date_In = date_In;
    }

    public String getDate_Out() {
        return date_Out;
    }

    public void setDate_Out(String date_Out) {
        this.date_Out = date_Out;
    }

    public Room_Type getRoom_Type_Reserve() {
        return room_Type_Reserve;
    }

    public void setRoom_Type_Reserve(Room_Type room_Type_Reserve) {
        this.room_Type_Reserve = room_Type_Reserve;
    }

    public int getAmount_Total() {
        return amount_Total;
    }

    public void setAmount_Total(int amount_Total) {
        this.amount_Total = amount_Total;
    }

    public EmployeeInfo getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(EmployeeInfo employee_id) {
        this.employee_id = employee_id;
    }

    public Hotel getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Hotel hotel_id) {
        this.hotel_id = hotel_id;
    }
}
