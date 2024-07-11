package com.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.entites.Room;
import com.hotel.repository.RoomRepository;

@Service
@Transactional
public class RoomServiceImplementation implements RoomService {
	
	@Autowired
	private RoomRepository roomRepository;
	@Override
	public List<Room> selectAvailableRooms() {
		return roomRepository.findByIsAvailability(true);
	}

}
