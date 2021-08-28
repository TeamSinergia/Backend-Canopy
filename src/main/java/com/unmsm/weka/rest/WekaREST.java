package com.unmsm.weka.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unmsm.weka.model.WekaModel;
import com.unmsm.weka.service.WekaService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api/weka")
public class WekaREST {

	@Autowired
	private WekaService wekaService;
	
	@GetMapping
	private ResponseEntity <WekaModel> listAll(){
		return ResponseEntity.ok(wekaService.getAllWeka());
	}
		
	
	
}
