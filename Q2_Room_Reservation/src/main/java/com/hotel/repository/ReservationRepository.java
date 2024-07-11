package com.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.entites.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
