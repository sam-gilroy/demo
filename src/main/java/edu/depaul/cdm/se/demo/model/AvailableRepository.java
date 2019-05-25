package edu.depaul.cdm.se.demo.model;


import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface AvailableRepository extends CrudRepository<Available, Long>  {
    List<Available> findByRoomNumAndStatus(int roomNum, boolean status);
}
