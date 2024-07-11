package com.hotel.service;

import com.hotel.dtos.ReservationDTO;

public interface ReservationService {

	ReservationDTO insertReservation(ReservationDTO reservationDto);

	String deleteFromReservation(Long reserveId);

}
