package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseForm;
import com.rays.dto.HotelDTO;


public class HotelForm extends BaseForm {
	
	@NotEmpty(message = "please enter participant_name")
	private String participant_name;

	@NotEmpty(message = "please enter block_name")
	private String block_name;

	@NotEmpty(message = "please enter room_number")
	private String room_number;
	
	@NotNull(message = "please enter allotment_date")
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
	public HotelDTO getDto() {

		HotelDTO dto = initDTO(new HotelDTO());
		dto.setParticipant_name(participant_name);;
		dto.setBlock_name(block_name);
		dto.setRoom_number(room_number);
		dto.setAllotment_date(allotment_date);
		return dto;
	}
}
