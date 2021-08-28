package com.unmsm.weka.rest;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.unmsm.weka.model.CanopyModel;

import com.unmsm.weka.service.CanopyService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api/canopy")
public class CanopyREST {

	@Autowired
	CanopyService canopyService;
	
	@GetMapping("/{id}")
	@ResponseBody
	public ArrayList<CanopyModel> obtenerCanopys(@PathVariable Long id){
		return canopyService.obtenerCanopys(id);
	}
	
	
}
