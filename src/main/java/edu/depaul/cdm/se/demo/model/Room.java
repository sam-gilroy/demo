package edu.depaul.cdm.se.demo.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "room")
public class Room {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "num")
    private int roomNumber;

    @OneToOne(mappedBy = "status", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Available status;

    @ManyToOne
    @JoinColumn (name = "room_Number_Type",nullable = false)
    private Room_Type room_Number_Type;

    @OneToMany(mappedBy = "room_Num", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<Available> room_Num;

    @OneToMany(mappedBy = "room_Num_Avail", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @ToString.Exclude
    private List<Confirmation> room_Num_Avail;

    public List<Confirmation> getRoom_Num_Avail() {
        return room_Num_Avail;
    }

    public void setRoom_Num_Avail(List<Confirmation> room_Num_Avail) {
        this.room_Num_Avail = room_Num_Avail;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Available getStatus() {
        return status;
    }

    public void setStatus(Available status) {
        this.status = status;
    }

    public List<Available> getRoom_Num() {
        return room_Num;
    }

    public void setRoom_Num(List<Available> room_Num) {
        this.room_Num = room_Num;
    }

    public Room_Type getRoom_Number_Type() {
        return room_Number_Type;
    }

    public void setRoom_Number_Type(Room_Type room_Number_Type) {
        this.room_Number_Type = room_Number_Type;
    }
}
