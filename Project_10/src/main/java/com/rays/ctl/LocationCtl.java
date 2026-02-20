package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.LocationDTO;
import com.rays.form.LocationForm;
import com.rays.service.LocationServiceInt;

@RestController
@RequestMapping(value = "Location")
public class LocationCtl extends BaseCtl<LocationForm, LocationDTO, LocationServiceInt> {
	
	 @GetMapping("/preload")
		public ORSResponse preload() {
			ORSResponse res = new ORSResponse(true);
			HashMap<Integer, String> map=new HashMap<Integer, String>();
			map.put(1, "indore");
			map.put(2, "bhopal");
			map.put(3, "dewas");
			
			res.addResult("city", map);
			return res;
		}


}
