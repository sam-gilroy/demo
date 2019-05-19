package edu.depaul.cdm.se.demo.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GuestRepository extends CrudRepository<Guest, Long> {
    List<Guest> findByGuestName(String GuestName);
}
