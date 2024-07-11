package com.hotel.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.dtos.ReservationDTO;
import com.hotel.entites.Reservation;
import com.hotel.entites.Room;
import com.hotel.exception.ReservationException;
import com.hotel.repository.ReservationRepository;
import com.hotel.repository.RoomRepository;

@Service
@Transactional
public class ReservationServiceImplementation implements ReservationService {
	
	@Autowired
	private RoomRepository roomRepository;
	
	@Autowired
	private ReservationRepository reservationRepository;
	
	@Autowired   
	private ModelMapper mapper;
	
	@Override
	public ReservationDTO insertReservation(ReservationDTO reservationDto) {
		Room room = roomRepository.findById(reservationDto.getRoomId()).get();
		if(!room.getIsAvailability()) {
			throw new ReservationException("Room is not availbale");
		}
		else {
			Reservation reservation = new Reservation();
			reservation.setGuestName(reservationDto.getGuestRoom());
			reservation.setCheck_In_Date(reservationDto.getCheck_In_Date());
			reservation.setCheck_Out_Date(reservationDto.getCheck_out_Date());
			reservation.setRoom(room);
			
			reservationRepository.save(reservation);
			return new ReservationDTO(reservation);
		}
	
	}

	@Override
	public String deleteFromReservation(Long reserveId) {
		String message = "Deletion Failed";
		if(reservationRepository.existsById(reserveId)) {
		Reservation  reserve = reservationRepository.findById(reserveId).orElseThrow();
		Room room = roomRepository.findById(reserve.getRoom().getRoomId()).orElseThrow();
		room.setIsAvailability(true);
		roomRepository.save(room);
		reservationRepository.delete(reserve);
		message = "Deletion Successful";
	}
	return message;
}		
	
	
	

}
