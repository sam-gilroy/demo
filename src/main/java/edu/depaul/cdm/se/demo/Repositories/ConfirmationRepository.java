package edu.depaul.cdm.se.demo.Repositories;

import edu.depaul.cdm.se.demo.model.Confirmation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ConfirmationRepository extends CrudRepository<Confirmation, Long> {
        List<Confirmation> findAll();
}
