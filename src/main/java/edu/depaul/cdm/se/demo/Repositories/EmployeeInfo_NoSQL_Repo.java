package edu.depaul.cdm.se.demo.Repositories;

import edu.depaul.cdm.se.demo.model.EmployeeInfo_NoSQL;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeInfo_NoSQL_Repo extends CrudRepository<EmployeeInfo_NoSQL, String> {
    List<EmployeeInfo_NoSQL> findAll();
}
