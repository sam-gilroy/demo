package edu.depaul.cdm.se.demo.Repositories;

import edu.depaul.cdm.se.demo.model.Position;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PositionRepository extends CrudRepository<Position, Long> {
    List<Position> findByPositionName(String PositionName);
}
