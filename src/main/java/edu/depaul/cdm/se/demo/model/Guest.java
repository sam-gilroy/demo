package edu.depaul.cdm.se.demo.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "guests")
public class Guest implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "name")
    private String guestName;

    @Column (name = "email")
    private String guest_Email;

    @OneToMany(mappedBy = "guest_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<Reservation> guest_id;

    public Long getId(){
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getGuest_Name() {
        return guestName;
    }

    public void setGuest_Name(String guest_Name) {
        this.guestName = guest_Name;
    }

    public String getGuest_Email() {
        return guest_Email;
    }

    public void setGuest_Email(String guest_Email) {
        this.guest_Email = guest_Email;
    }

    public List<Reservation> getGuest_id() {
        return guest_id;
    }

    public void setGuest_id(List<Reservation> guest_id) {
        this.guest_id = guest_id;
    }
}
