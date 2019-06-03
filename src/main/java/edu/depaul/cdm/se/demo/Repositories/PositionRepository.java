package edu.depaul.cdm.se.demo.Repositories;

import edu.depaul.cdm.se.demo.model.Position;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface PositionRepository extends CrudRepository<Position, Long> {
    List<Position> findByPositionName(String PositionName);
}
