package com.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicle.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByUname(String uname);
}
