package edu.depaul.cdm.se.demo.Repositories;

import edu.depaul.cdm.se.demo.model.Room_Type;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource

public interface RoomTypeRepository extends CrudRepository<Room_Type,Long> {
    //Room_Type findByRoomSize(String RoomSize);
    List<Room_Type> findAll();
}
