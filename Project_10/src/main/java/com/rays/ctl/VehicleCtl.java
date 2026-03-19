package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.VehicleDTO;
import com.rays.form.VehicleForm;
import com.rays.service.VehicleServiceInt;

@RestController
@RequestMapping(value = "Vehicle")
public class VehicleCtl extends BaseCtl<VehicleForm, VehicleDTO, VehicleServiceInt> {
	
	
	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "abc");
		map.put(2, "xyz");
		map.put(3, "pqr");
		
		res.addResult("owner_name", map);
		return res;
	}

}
