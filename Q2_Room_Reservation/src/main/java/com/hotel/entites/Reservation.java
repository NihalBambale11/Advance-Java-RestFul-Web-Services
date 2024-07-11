package com.hotel.entites;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity

@NoArgsConstructor
@Getter
@Setter


public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long reserveId;
	
	private String guestName;
	
	private LocalDate check_In_Date;
	
	private LocalDate check_Out_Date;
	
	@OneToOne
    @JoinColumn(name = "room_id")
	private Room room;
	
	private double totalprice;

	public Reservation(String guestName, LocalDate check_In_Date, LocalDate check_Out_Date, Room room,
			double totalprice) {
		super();
		this.guestName = guestName;
		this.check_In_Date = check_In_Date;
		this.check_Out_Date = check_Out_Date;
		this.room = room;
		this.totalprice = totalprice;
	}
	
	
	
	
}
