package com.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.service.RoomService;

@RestController

public class RoomController {
	
	@Autowired
	private RoomService roomService;
	
	public RoomController() {
		System.out.println("Hello From Room Controller");
	}
	
	@GetMapping(params = "isAvailable=yes")
	public ResponseEntity<?> showAvailableRooms(@RequestParam boolean isAvailable ){
		return ResponseEntity.ok(roomService.selectAvailableRooms());
	}
	
	//http://localhost:8080/?isAvailable=yes
	
	
	
}
