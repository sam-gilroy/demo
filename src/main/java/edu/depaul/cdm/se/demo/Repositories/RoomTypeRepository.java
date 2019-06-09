package edu.depaul.cdm.se.demo.Repositories;
import edu.depaul.cdm.se.demo.model.RoomType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface RoomTypeRepository extends CrudRepository<RoomType,Long> {
    RoomType findByRoomSize(String RoomSize);
    List<RoomType> findAll();
}
