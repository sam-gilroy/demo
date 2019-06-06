package edu.depaul.cdm.se.demo.Repositories;

import edu.depaul.cdm.se.demo.model.Position_NoSQL;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Position_NoSQL_Repo extends CrudRepository<Position_NoSQL, String> {
    List<Position_NoSQL> findAll();
}
