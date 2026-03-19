package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseForm;
import com.rays.dto.HotelDTO;
import com.rays.dto.VehicleDTO;

public class VehicleForm extends BaseForm{
	
	@NotEmpty(message = "please enter vehicle_number")
	private String vehicle_number;

	@NotEmpty(message = "please enter owner_name")
	private String owner_name;

	@NotEmpty(message = "please enter service_type")
	private String service_type;
	
	@NotNull(message = "please enter service_date")
	private Date service_date;
	
	

	public String getVehicle_number() {
		return vehicle_number;
	}

	public void setVehicle_number(String vehicle_number) {
		this.vehicle_number = vehicle_number;
	}

	public String getOwner_name() {
		return owner_name;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	public String getService_type() {
		return service_type;
	}

	public void setService_type(String service_type) {
		this.service_type = service_type;
	}

	public Date getService_date() {
		return service_date;
	}

	public void setService_date(Date service_date) {
		this.service_date = service_date;
	}
	@Override
	public VehicleDTO getDto() {

		VehicleDTO dto = initDTO(new VehicleDTO());
		dto.setVehicle_number(vehicle_number);
		dto.setOwner_name(owner_name);
		dto.setService_type(service_type);
		dto.setService_date(service_date);
		return dto;
	
	}

}
