package edu.depaul.cdm.se.demo.Repositories;

import edu.depaul.cdm.se.demo.model.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource

public interface RoomRepository extends CrudRepository<Room,Long> {
    //List<Room> findByRoomNumber(String RoomNumber);
    List<Room> findAll();
}
