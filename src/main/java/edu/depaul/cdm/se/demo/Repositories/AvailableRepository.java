package edu.depaul.cdm.se.demo.Repositories;


import edu.depaul.cdm.se.demo.model.Available;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface AvailableRepository extends CrudRepository<Available, Long>  {
    List<Available> findByRoomNumAndStatus(int roomNum, boolean status);
}
