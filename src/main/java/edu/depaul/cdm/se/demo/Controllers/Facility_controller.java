/*
package edu.depaul.cdm.se.demo.Controllers;

import edu.depaul.cdm.se.demo.model.Facility;
import edu.depaul.cdm.se.demo.Repositories.FacilityRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Facility_controller {
    private FacilityRepository repo;

    public Facility_controller (FacilityRepository repo){
        this.repo = repo;
    }

    @GetMapping("/facility")
    public Collection<Facility> facilities() {
        return repo.findAll().stream().collect(Collectors.toList());
    }
}

 */
