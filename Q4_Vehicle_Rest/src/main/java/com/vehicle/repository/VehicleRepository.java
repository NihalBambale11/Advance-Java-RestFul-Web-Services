package com.vehicle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicle.entities.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long>{
	
	List<Vehicle> findByUser_Uname(String uname);
	
	void deleteByUser_Uname(String name);
}
