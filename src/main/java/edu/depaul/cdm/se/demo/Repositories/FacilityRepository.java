package edu.depaul.cdm.se.demo.Repositories;
import edu.depaul.cdm.se.demo.model.Facility;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface FacilityRepository extends CrudRepository<Facility,Long>{

    List<Facility> findByFacilityName(String FacilityName);

    @Override
    List<Facility> findAll();
}
