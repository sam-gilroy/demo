package edu.depaul.cdm.se.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "roomNumbers")
public class Room {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "num")
    private int roomNumber;

    @Column(name = "available")
    private boolean avail;

    @ManyToOne
    @JoinColumn (name = "roomNumberType",nullable = false)
    private RoomType roomNumberType;

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

    public boolean isAvail() {
        return avail;
    }

    public void setAvail(boolean avail) {
        this.avail = avail;
    }

    public RoomType getRoomNumberType() {
        return roomNumberType;
    }

    public void setRoomNumberType(RoomType roomNumberType) {
        this.roomNumberType = roomNumberType;
    }
}
