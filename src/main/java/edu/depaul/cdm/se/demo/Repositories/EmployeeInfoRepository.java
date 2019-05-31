package edu.depaul.cdm.se.demo.Repositories;

import edu.depaul.cdm.se.demo.model.EmployeeInfo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeInfoRepository extends CrudRepository<EmployeeInfo, Long> {
    List<EmployeeInfo> findByEmployeeName(String EmployeeName);
}
