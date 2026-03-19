package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_VEHICLE")
public class VehicleDTO extends BaseDTO{
	
	@Column(name = "VEHICLE_NUMBER", length = 50)
	private String vehicle_number;

	@Column(name = "OWNER_NAME", length = 50)
	private String owner_name;

	@Column(name = "SERVICE_TYPE", length = 50)
	private String service_type;

	@Column(name = "SERVICE_DATE")
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
	public String getValue() {
		// TODO Auto-generated method stub
		return owner_name;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "owner_name";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return owner_name;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return owner_name;
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("owner_name", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {

		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("owner_name", vehicle_number);
		return map;
	}

}
