package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_HOTEL")
public class HotelDTO extends BaseDTO{
	
	@Column(name = "PARTICIPANT_NAME", length = 50)
	private String participant_name;

	@Column(name = "BLOCK_NAME", length = 50)
	private String block_name;

	@Column(name = "ROOM_NUMBER", length = 50)
	private String room_number;
	
	@Column(name = "ALLOTMENT_DATE")
	private Date allotment_date;
	

	public String getParticipant_name() {
		return participant_name;
	}

	public void setParticipant_name(String participant_name) {
		this.participant_name = participant_name;
	}

	public String getBlock_name() {
		return block_name;
	}

	public void setBlock_name(String block_name) {
		this.block_name = block_name;
	}

	public String getRoom_number() {
		return room_number;
	}

	public void setRoom_number(String room_number) {
		this.room_number = room_number;
	}

	public Date getAllotment_date() {
		return allotment_date;
	}

	public void setAllotment_date(Date allotment_date) {
		this.allotment_date = allotment_date;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return room_number;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "room_number";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return room_number;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return room_number;
	}


	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("room_number", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {

		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("room_number", room_number);
		return map;
	}

}
