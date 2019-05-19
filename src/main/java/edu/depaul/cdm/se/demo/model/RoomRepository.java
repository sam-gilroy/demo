package edu.depaul.cdm.se.demo.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RoomRepository extends CrudRepository<Room,Long> {
    List<Room> findByRoomNumber(String RoomNumber);
}
