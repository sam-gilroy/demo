package edu.depaul.cdm.se.demo.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ConfirmationRepository extends CrudRepository<Confirmation, Long> {
        List<Confirmation> findById(long id);
}
