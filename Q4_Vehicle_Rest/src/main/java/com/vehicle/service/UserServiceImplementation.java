package com.vehicle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import com.vehicle.entities.User;
import com.vehicle.exception.UserVehicleException;
import com.vehicle.repository.UserRepository;

@Service
@Transactional
public class UserServiceImplementation implements UserService {

	@Autowired
	UserRepository userRepository;
	@Override
	public User getUserById(Long uid) {
		return userRepository.findById(uid).orElseThrow(()-> new UserVehicleException("USer Not Found "));
	}

	
	
}
