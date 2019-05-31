package edu.depaul.cdm.se.demo.Repositories;

import edu.depaul.cdm.se.demo.model.RoomType_NoSQL;
import org.springframework.data.repository.CrudRepository;

public interface RoomType_NoSQL_Repo extends CrudRepository<RoomType_NoSQL, String> {
    public RoomType_NoSQL findByRoomSize(String RoomSize);
}
