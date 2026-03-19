package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.VehicleDTO;

@Repository
public class VehicleDAOImp extends BaseDAOImpl<VehicleDTO> implements VehicleDAOInt {
	

	@Override
	protected List<Predicate> getWhereClause(VehicleDTO dto, CriteriaBuilder builder, Root<VehicleDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if (!isEmptyString(dto.getVehicle_number())) {

			whereCondition.add(builder.like(qRoot.get("vehicle_number"), dto.getVehicle_number() + "%"));
		}

		if (!isEmptyString(dto.getOwner_name())) {

			whereCondition.add(builder.like(qRoot.get("owner_name"), dto.getOwner_name() + "%"));
		}

		if (!isEmptyString(dto.getService_type())) {

			whereCondition.add(builder.like(qRoot.get("service_type"), dto.getService_type() + "%"));
		}

		if  (isNotNull(dto.getService_date())) {

			whereCondition.add(builder.equal(qRoot.get("service_date"), dto.getService_date()));
		}
		return whereCondition;
	}

	@Override
	public Class<VehicleDTO> getDTOClass() {
		// TODO Auto-generated method stub
		 return VehicleDTO.class;
	}


}
