package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.CarDTO;
import com.rays.dto.PlacementDTO;

@Repository
public class CarDAOImp extends BaseDAOImpl<CarDTO> implements CarDAOInt {
	
	@Override
	protected List<Predicate> getWhereClause(CarDTO dto, CriteriaBuilder builder, Root<CarDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getCar_code())) {

			whereCondition.add(builder.like(qRoot.get("car_code"), dto.getCar_code() + "%"));
		}

		if (!isEmptyString(dto.getCar_name())) {

			whereCondition.add(builder.like(qRoot.get("car_name"), dto.getCar_name() + "%"));
		}

		if (!isEmptyString(dto.getCar_model())) {

			whereCondition.add(builder.like(qRoot.get("car_model"), dto.getCar_model() + "%"));
		}

		if (!isEmptyString(dto.getCar_status())) {

			whereCondition.add(builder.like(qRoot.get("car_status"), dto.getCar_status() + "%"));
		}
		
		
		return whereCondition;
	}

	@Override
	public Class<CarDTO> getDTOClass() {
		
		return CarDTO.class;
	}


}
