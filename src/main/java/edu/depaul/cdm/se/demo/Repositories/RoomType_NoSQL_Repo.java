package edu.depaul.cdm.se.demo.Repositories;

import edu.depaul.cdm.se.demo.model.RoomType_NoSQL;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface RoomType_NoSQL_Repo extends CrudRepository<RoomType_NoSQL, String> {
    List<RoomType_NoSQL>  findByRoomSize(String RoomSize);
    List<RoomType_NoSQL> findAll();
}
