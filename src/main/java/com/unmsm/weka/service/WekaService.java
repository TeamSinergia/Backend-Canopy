package com.unmsm.weka.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unmsm.weka.model.WekaModel;
import com.unmsm.weka.repository.WekaRepository;

@Service
public class WekaService {

	@Autowired
	private WekaRepository wekaRepository;
	
	public WekaModel getAllWeka(){
		return wekaRepository.getModel();
	}
	
		
}
