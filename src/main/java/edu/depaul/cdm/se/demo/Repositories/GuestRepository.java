package edu.depaul.cdm.se.demo.Repositories;

import edu.depaul.cdm.se.demo.model.Guest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface GuestRepository extends CrudRepository<Guest, Long> {
    List<Guest> findByGuestName(String GuestName);
}
