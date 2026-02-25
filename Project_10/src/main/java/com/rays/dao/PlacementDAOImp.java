package com.rays.dao;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.PlacementDTO;


@Repository
public class PlacementDAOImp extends BaseDAOImpl<PlacementDTO> implements PlacementDAOInt {

	@Override
	protected List<Predicate> getWhereClause(PlacementDTO dto, CriteriaBuilder builder, Root<PlacementDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getPlacement_code())) {

			whereCondition.add(builder.like(qRoot.get("placement_code"), dto.getPlacement_code() + "%"));
		}

		if (!isEmptyString(dto.getStudent_name())) {

			whereCondition.add(builder.like(qRoot.get("student_name"), dto.getStudent_name() + "%"));
		}

		if (!isEmptyString(dto.getCompany_name())) {

			whereCondition.add(builder.like(qRoot.get("company_name"), dto.getCompany_name() + "%"));
		}

		if (!isEmptyString(dto.getPlacement_status())) {

			whereCondition.add(builder.like(qRoot.get("placement_status"), dto.getPlacement_status() + "%"));
		}
		
		
		return whereCondition;
	}

	@Override
	public Class<PlacementDTO> getDTOClass() {
		
		return PlacementDTO.class;
	}

	
	}

