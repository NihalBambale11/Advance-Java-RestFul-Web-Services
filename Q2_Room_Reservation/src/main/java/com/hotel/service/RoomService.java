package com.hotel.service;

import java.util.List;

import com.hotel.entites.Room;

public interface RoomService  {
	List<Room> selectAvailableRooms();
}
