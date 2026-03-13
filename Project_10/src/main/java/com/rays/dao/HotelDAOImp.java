package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dao.HotelDAOint;
import com.rays.dto.HotelDTO;
@Repository
public class HotelDAOImp extends BaseDAOImpl<HotelDTO> implements HotelDAOint {
	
	
	@Override
	protected List<Predicate> getWhereClause(HotelDTO dto, CriteriaBuilder builder, Root<HotelDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if (!isEmptyString(dto.getParticipant_name())) {

			whereCondition.add(builder.like(qRoot.get("participant_name"), dto.getParticipant_name() + "%"));
		}

		if (!isEmptyString(dto.getBlock_name())) {

			whereCondition.add(builder.like(qRoot.get("block_name"), dto.getBlock_name() + "%"));
		}

		if (!isEmptyString(dto.getRoom_number())) {

			whereCondition.add(builder.like(qRoot.get("room_number"), dto.getRoom_number() + "%"));
		}

		if  (isNotNull(dto.getAllotment_date())) {

			whereCondition.add(builder.equal(qRoot.get("allotment_date"), dto.getAllotment_date()));
		}
		return whereCondition;
	}

	@Override
	public Class<HotelDTO> getDTOClass() {
		// TODO Auto-generated method stub
		 return HotelDTO.class;
	}

	

}
