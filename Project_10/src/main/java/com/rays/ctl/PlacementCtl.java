package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.PlacementDTO;
import com.rays.form.PlacementForm;
import com.rays.service.PlacementServiceInt;

@RestController
@RequestMapping(value = "Placement")
public class PlacementCtl extends BaseCtl<PlacementForm, PlacementDTO, PlacementServiceInt>{
	
	 @GetMapping("/preload")
		public ORSResponse preload() {
			ORSResponse res = new ORSResponse(true);
			HashMap<Integer, String> map=new HashMap<Integer, String>();
			map.put(1, "TCS");
			map.put(2, "Techmahin");
			map.put(3, "Cemence");
			
			res.addResult("company_name", map);
			return res;
		}


}
