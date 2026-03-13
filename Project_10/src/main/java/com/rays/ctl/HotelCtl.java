package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.HotelDTO;
import com.rays.form.HotelForm;
import com.rays.service.HotelServiceInt;

@RestController
@RequestMapping(value = "Hotel")
public class HotelCtl extends BaseCtl<HotelForm, HotelDTO, HotelServiceInt> {
	
	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "Delux");
		map.put(2, "Normal");
		map.put(3, "SuperDelux");
		
		res.addResult("room_number", map);
		return res;
	}

}
