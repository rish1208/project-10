package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_LOCATION")
public class LocationDTO extends BaseDTO {

	@Column(name = "CITY", length = 50)
	private String city;

	@Column(name = "COUNTRY", length = 50)
	private String country;

	@Column(name = "LOCATION_STATUS", length = 50)
	private String location_status;

	@Column(name = "STATE", length = 50)
	private String state;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLocation_status() {
		return location_status;
	}

	public void setLocation_status(String location_status) {
		this.location_status = location_status;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return city;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "city";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return city;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return city;
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("city", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {

		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("city", city);
		return map;

	}
}