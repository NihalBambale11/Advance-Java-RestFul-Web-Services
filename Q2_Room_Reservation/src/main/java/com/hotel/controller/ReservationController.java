package com.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.dtos.ReservationDTO;
import com.hotel.service.ReservationService;

@RestController
public class ReservationController {
	
	@Autowired
	ReservationService reserveService;
	
	public ReservationController() {
		System.out.println("Hello From Reservation Controller");
	}
	
	@PostMapping("/reservations")
	public ResponseEntity<?> createReservation(@RequestBody ReservationDTO reservationDto){
		return ResponseEntity.status(HttpStatus.CREATED).body(reserveService.insertReservation(reservationDto));
	}
	

	
	@DeleteMapping("/reservations/{reserveId}")
	public ResponseEntity<?> deleteReservation(@PathVariable Long reserveId){
		return ResponseEntity.status(HttpStatus.CREATED).body(reserveService.deleteFromReservation(reserveId));
	}
	
	
}
