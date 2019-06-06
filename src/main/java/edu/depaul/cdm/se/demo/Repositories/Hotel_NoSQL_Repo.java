package edu.depaul.cdm.se.demo.Repositories;

import com.mongodb.Mongo;
import edu.depaul.cdm.se.demo.model.Hotel_NoSQL;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;


public interface Hotel_NoSQL_Repo extends CrudRepository<Hotel_NoSQL, String> {
    List<Hotel_NoSQL> findByHotelName(String HotelName);

    List<Hotel_NoSQL> findAll();

    List<Hotel_NoSQL> findByRoomType();
}
