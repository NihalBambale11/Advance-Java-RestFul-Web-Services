package com.hotel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.entites.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {
	List<Room> findByIsAvailability(boolean availability);
}
