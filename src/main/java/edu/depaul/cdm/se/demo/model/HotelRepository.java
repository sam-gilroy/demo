package edu.depaul.cdm.se.demo.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HotelRepository extends CrudRepository<Hotel,Long> {
    List<Hotel> findByHotelName(String HotelName);
}
