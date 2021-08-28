package com.unmsm.weka.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unmsm.weka.repository.CanopyRepository;
import com.unmsm.weka.model.CanopyModel;

@Service
public class CanopyService {
	
	@Autowired
	CanopyRepository canopyRepository;
	
	public ArrayList<CanopyModel> obtenerCanopys(Long id){
		return (ArrayList<CanopyModel>) canopyRepository.getModel(id);
	}
	
	
}
