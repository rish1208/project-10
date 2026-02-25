package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_PLACEMENT")
public class PlacementDTO extends BaseDTO {

	@Column(name = "PLACEMENT_CODE", length = 50)
	private String placement_code;

	@Column(name = "STUDENT_NAME", length = 50)
	private String student_name;

	@Column(name = "COMPANY_NAME", length = 50)
	private String company_name;

	@Column(name = "PLACEMENT_STATUS", length = 50)
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
	public String getValue() {
		// TODO Auto-generated method stub
		return company_name;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "company_name";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return company_name;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return company_name;
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("company_name", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {

		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("company_name", company_name);
		return map;

	}
}
