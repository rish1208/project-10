package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseForm;
import com.rays.dto.CarDTO;


public class CarForm extends BaseForm{
	
	@NotEmpty(message = "please enter car_code")
	private String car_code;

	@NotEmpty(message = "please enter car_name")
	private String car_name;

	@NotEmpty(message = "please enter car_model")
	private String car_model;

	@NotEmpty(message = "please enter car_status")
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
	public CarDTO getDto() {

		CarDTO dto = initDTO(new CarDTO());
		dto.setCar_code(car_code);
		dto.setCar_name(car_name);
		dto.setCar_model(car_model);
		dto.setCar_status(car_status);
		return dto;
	}

}
