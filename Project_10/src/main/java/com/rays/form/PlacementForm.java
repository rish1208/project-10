package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseForm;
import com.rays.dto.PlacementDTO;

public class PlacementForm extends BaseForm {

	@NotEmpty(message = "please enter placement_code")
	private String placement_code;

	@NotEmpty(message = "please enter student_name")
	private String student_name;

	@NotEmpty(message = "please enter company_name")
	private String company_name;

	@NotEmpty(message = "please enter placement_status")
	private String placement_status;

	public String getPlacement_code() {
		return placement_code;
	}

	public void setPlacement_code(String placement_code) {
		this.placement_code = placement_code;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getPlacement_status() {
		return placement_status;
	}

	public void setPlacement_status(String placement_status) {
		this.placement_status = placement_status;
	}

	@Override
	public PlacementDTO getDto() {

		PlacementDTO dto = initDTO(new PlacementDTO());
		dto.setPlacement_code(placement_code);
		dto.setStudent_name(student_name);
		dto.setCompany_name(company_name);
		dto.setPlacement_status(placement_status);
		return dto;

	}
}
