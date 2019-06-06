package edu.depaul.cdm.se.demo.model;

import edu.depaul.cdm.se.demo.Repositories.RoomTypeRepository;
import edu.depaul.cdm.se.demo.Repositories.RoomType_NoSQL_Repo;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "reserve")
public class Reservation {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn (name = "guest_id",nullable = false)
    private Guest guest_id;

    @Column(name="dateIn")
    private String dateIn;

    @Column(name="dateOut")
    private String dateOut;

    @OneToOne
    @JoinColumn(name = "roomTypeReserve",nullable = false)
    private RoomType roomTypeReserve;

    @Column (name = "amountTotal")
    private int amountTotal;

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

    public String getDateIn() {
        return dateIn;
    }

    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }

    public String getDateOut() {
        return dateOut;
    }

    public void setDateOut(String dateOut) {
        this.dateOut = dateOut;
    }

    public RoomType getRoomTypeReserve() {
        return roomTypeReserve;
    }

    public void setRoomTypeReserve(RoomType roomTypeReserve) {
        this.roomTypeReserve = roomTypeReserve;
    }

    public int getAmountTotal() {
        return amountTotal;
    }

    public void setAmountTotal(int amountTotal) {
        this.amountTotal = amountTotal;
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
