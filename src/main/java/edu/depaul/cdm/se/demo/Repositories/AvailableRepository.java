package edu.depaul.cdm.se.demo.Repositories;


import edu.depaul.cdm.se.demo.model.Available;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface AvailableRepository extends CrudRepository<Available, Long>  {
    List<Available> findByRoomNumAndStatus(int roomNum, boolean status);
}
