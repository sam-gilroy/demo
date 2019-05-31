package edu.depaul.cdm.se.demo.Repositories;
import edu.depaul.cdm.se.demo.model.RoomType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RoomTypeRepository extends CrudRepository<RoomType,Long> {
    RoomType findByRoomSize(String RoomSize);
}
