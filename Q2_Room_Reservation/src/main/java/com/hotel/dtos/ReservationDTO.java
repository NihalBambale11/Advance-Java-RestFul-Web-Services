package com.hotel.dtos;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.hotel.entites.Reservation;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

@NoArgsConstructor

public class ReservationDTO {
	

	private String guestRoom;
	private LocalDate check_In_Date;
	private LocalDate check_out_Date;
	@JsonProperty(access = Access.WRITE_ONLY)
	private Long roomId;
	
	public ReservationDTO(Reservation reservation) {
		
	}
}
