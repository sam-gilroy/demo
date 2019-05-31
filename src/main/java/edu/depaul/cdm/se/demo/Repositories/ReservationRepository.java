package edu.depaul.cdm.se.demo.Repositories;

import edu.depaul.cdm.se.demo.model.Reservation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReservationRepository extends CrudRepository<Reservation,Long> {
    List<Reservation> findById(String id);
}
