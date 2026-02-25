package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.CarDTO;
import com.rays.form.CarForm;
import com.rays.service.CarServiceInt;

@RestController
@RequestMapping(value = "Car")
public class CarCtl extends BaseCtl<CarForm, CarDTO, CarServiceInt>{
	
	 @GetMapping("/preload")
		public ORSResponse preload() {
			ORSResponse res = new ORSResponse(true);
			HashMap<Integer, String> map=new HashMap<Integer, String>();
			map.put(1, "Thar");
			map.put(2, "BMW");
			map.put(3, "Audi");
			
			res.addResult("car_name", map);
			return res;
		}

}
