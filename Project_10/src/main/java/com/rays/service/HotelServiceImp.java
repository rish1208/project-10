package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.common.BaseServiceInt;
import com.rays.dao.HotelDAOint;
import com.rays.dto.CarDTO;
import com.rays.dto.HotelDTO;

@Service
@Transactional
public class HotelServiceImp extends BaseServiceImpl<HotelDTO, HotelDAOint> implements HotelServiceInt {

}
