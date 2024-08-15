package com.vehicle.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.vehicle.entities.Company;

public class VehicleDTO {
	
	@NotBlank
	private String Vname;
	
	@NotNull
	private Company company;
	
	@NotBlank
	private String Vnumber;
	
	public String getVnumber() {
		return Vnumber;
	}

	public void setVnumber(String vnumber) {
		Vnumber = vnumber;
	}

	@NotBlank
	@Size(min = 10 , max = 10)
	private String Vtype;
	
	@NotNull
	private Long uid;

	public String getVname() {
		return Vname;
	}

	public void setVname(String vname) {
		Vname = vname;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getVtype() {
		return Vtype;
	}

	public void setVtype(String vtype) {
		Vtype = vtype;
	}

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}
	
	
	
}
