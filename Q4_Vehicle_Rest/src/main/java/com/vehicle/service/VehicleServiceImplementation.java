package com.vehicle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vehicle.dtos.VehicleDTO;
import com.vehicle.entities.User;
import com.vehicle.entities.Vehicle;
import com.vehicle.exception.UserVehicleException;
import com.vehicle.repository.VehicleRepository;

@Service
@Transactional
public class VehicleServiceImplementation implements VehicleService {

	@Autowired
	UserService userService;
	
	@Autowired
	private VehicleRepository vehicleRepository;
	
	@Override
	public Vehicle insertInVehicle(VehicleDTO vehicledto) {
		User user = userService.getUserById(vehicledto.getUid());
		if(user == null) {
			throw new UserVehicleException("User Not Found ");
		}
		
		Vehicle vh = new Vehicle();
		vh.setVname(vehicledto.getVname());
		vh.setCompany(vehicledto.getCompany());
		vh.setVnumber(vehicledto.getVnumber());
		vh.setVtype(vehicledto.getVtype());
		vh.setUser(user);
		
		return vehicleRepository.save(vh);
		
	}

	@Override
	public List<Vehicle> selectVehicleByUname(String uname) {
		List<Vehicle> vehicles = vehicleRepository.findByUser_Uname(uname);
		if(vehicles.isEmpty()) {
			throw new IllegalArgumentException("No vehicle Found for the user");
		}
		return vehicles;
	}

	@Override
	public void deleteFromVehicle(String uname) {
		List<Vehicle> vehicles = vehicleRepository.findByUser_Uname(uname);
		if(vehicles.isEmpty()) {
			throw new IllegalArgumentException("No vehicle Found for the user");

		}
		vehicleRepository.deleteByUser_Uname(uname);
	}
	
	

}
