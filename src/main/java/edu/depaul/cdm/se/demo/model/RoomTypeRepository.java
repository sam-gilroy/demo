package edu.depaul.cdm.se.demo.model;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RoomTypeRepository extends CrudRepository<RoomType,Long> {
    RoomType findByRoomSize(String RoomSize);
}
