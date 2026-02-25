package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_CAR")
public class CarDTO extends BaseDTO {
	
	@Column(name = "CAR_CODE", length = 50)
	private String car_code;

	@Column(name = "CAR_NAME", length = 50)
	private String car_name;

	@Column(name = "CAR_MODEL", length = 50)
	private String car_model;

	@Column(name = "CAR_STATUS", length = 50)
	private String car_status;
	

	public String getCar_code() {
		return car_code;
	}

	public void setCar_code(String car_code) {
		this.car_code = car_code;
	}

	public String getCar_name() {
		return car_name;
	}

	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}

	public String getCar_model() {
		return car_model;
	}

	public void setCar_model(String car_model) {
		this.car_model = car_model;
	}

	public String getCar_status() {
		return car_status;
	}

	public void setCar_status(String car_status) {
		this.car_status = car_status;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return car_code;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "car_code";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return car_name;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return car_name;
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("car_name", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {

		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("car_name", car_name);
		return map;
	}
}
