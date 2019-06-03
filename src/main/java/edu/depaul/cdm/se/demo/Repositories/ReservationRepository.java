package edu.depaul.cdm.se.demo.Repositories;

import edu.depaul.cdm.se.demo.model.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ReservationRepository extends CrudRepository<Reservation,Long> {
    List<Reservation> findById(String id);
}
