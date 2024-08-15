package com.vehicle.controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.dtos.VehicleDTO;
import com.vehicle.service.VehicleService;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {
	
	@Autowired
	private VehicleService vehicleService;
	
	@PostMapping
	public ResponseEntity<?> addVehicle(@RequestBody VehicleDTO vehicledto){
		return ResponseEntity.status(HttpStatus.CREATED).body(vehicleService.insertInVehicle(vehicledto));
	}
	
	@GetMapping("/users/{uname}")
	public ResponseEntity<?> getVehicleByUname(@PathVariable String uname){
		return ResponseEntity.ok(vehicleService.selectVehicleByUname(uname));
	}
	
	@DeleteMapping("/users/{uname}")
	public ResponseEntity<?> deleteVehicleByUname(@PathVariable String uname){
		 vehicleService.deleteFromVehicle(uname);
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);	}
	
}
