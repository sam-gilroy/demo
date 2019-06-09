package edu.depaul.cdm.se.demo.Repositories;

import edu.depaul.cdm.se.demo.model.Available;
import edu.depaul.cdm.se.demo.model.EmployeeInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface EmployeeInfoRepository extends CrudRepository<EmployeeInfo, Long> {
    List<EmployeeInfo> findByEmployeeName(String EmployeeName);
    List<EmployeeInfo> findAll();
}
