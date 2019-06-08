package edu.depaul.cdm.se.demo.Repositories;

import edu.depaul.cdm.se.demo.model.Facility_NoSQL;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface Facility_NOSQL_Repo extends CrudRepository<Facility_NoSQL, String>{

    List<Facility_NoSQL> findByFacilityName(String FacilityName);
    List<Facility_NoSQL> findAll();
}
