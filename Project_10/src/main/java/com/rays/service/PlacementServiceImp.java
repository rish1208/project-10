package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.PlacementDAOInt;
import com.rays.dto.PlacementDTO;


@Service
@Transactional
public class PlacementServiceImp extends BaseServiceImpl<PlacementDTO, PlacementDAOInt> implements PlacementServiceInt {

	
}