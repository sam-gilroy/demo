package edu.depaul.cdm.se.demo.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

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

    @OneToOne(mappedBy = "status", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Available status;

    @ManyToOne
    @JoinColumn (name = "roomNumberType",nullable = false)
    private RoomType roomNumberType;

    @OneToOne(mappedBy = "roomNum", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Available roomNum;

    @OneToMany(mappedBy = "roomNumAvail", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @ToString.Exclude
    private List<Confirmation> roomNumAvail;

    public List<Confirmation> getRoomNumAvail() {
        return roomNumAvail;
    }

    public void setRoomNumAvail(List<Confirmation> roomNumAvail) {
        this.roomNumAvail = roomNumAvail;
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

    public Available getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(Available roomNum) {
        this.roomNum = roomNum;
    }

    public RoomType getRoomNumberType() {
        return roomNumberType;
    }

    public void setRoomNumberType(RoomType roomNumberType) {
        this.roomNumberType = roomNumberType;
    }
}
