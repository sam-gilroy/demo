package edu.depaul.cdm.se.demo.Repositories;
import edu.depaul.cdm.se.demo.model.Facility;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FacilityRepository extends CrudRepository<Facility,Long>{

    List<Facility> findByFacilityName(String FacilityName);

    @Override
    List<Facility> findAll();
}
