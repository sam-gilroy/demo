package edu.depaul.cdm.se.demo.Repositories;

import edu.depaul.cdm.se.demo.model.Hotel_NoSQL;
import org.springframework.data.repository.CrudRepository;


public interface Hotel_NoSQL_Repo extends CrudRepository<Hotel_NoSQL, String> {
    public Hotel_NoSQL findByHotelName(String HotelName);

}
