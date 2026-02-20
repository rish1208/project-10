package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseForm;

import com.rays.dto.LocationDTO;

public class LocationForm extends BaseForm {
	
	
	@NotEmpty(message = "please enter city")
	private String city;
	
	@NotEmpty(message = "please enter state")
	private String state;
	
	@NotEmpty(message = "please enter country")
	private String country;
	
	@NotEmpty(message = "please enter location status")
	private String location_status;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getLocation_status() {
		return location_status;
	}

	public void setLocation_status(String location_status) {
		this.location_status = location_status;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStatus() {
		return state;
	}

	public void setStatus(String status) {
		this.state = status;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
	
	@Override
	public LocationDTO getDto() {
		
		LocationDTO dto = initDTO(new LocationDTO());
		dto.setCity(city);
		dto.setState(state);
		dto.setCountry(country);
		dto.setLocation_status(location_status);
		return dto;
		
	}

}
