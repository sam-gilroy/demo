package edu.depaul.cdm.se.demo.Repositories;

import edu.depaul.cdm.se.demo.model.Hotel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface HotelRepository extends CrudRepository<Hotel,Long> {
    List<Hotel> findByHotelName(String HotelName);
    List<Hotel> findAll();
}
