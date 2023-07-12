package com.angular.angularApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.angular.angularApi.entity.InputEntity;
import com.angular.angularApi.repository.InputDataRepository;

@Service
public class InputDataService {

	@Autowired
	InputDataRepository inputDataRepository;
	
	public List<InputEntity> getAllData(){
		return inputDataRepository.findAll();
	}
	
	public InputEntity addData(InputEntity input){
		return inputDataRepository.save(input);
	}
	
	public void deleteData(InputEntity input){
		
		 inputDataRepository.delete(input);
		
	}
	
	public InputEntity updateData(InputEntity input){
		return inputDataRepository.save(input);
		}
}
