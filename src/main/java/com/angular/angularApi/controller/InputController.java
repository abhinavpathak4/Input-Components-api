package com.angular.angularApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.angular.angularApi.entity.InputEntity;
import com.angular.angularApi.service.InputDataService;

@RestController
@CrossOrigin
public class InputController {

	@Autowired
	InputDataService inputDataService;
	
	
	@GetMapping("/getAll")
	public ResponseEntity<List<InputEntity>> getAllData() {
            List<InputEntity> list = inputDataService.getAllData();

            if (list.isEmpty()) {
                return ResponseEntity.noContent().build();
            }

            return ResponseEntity.ok(list);
    }
	
	@PostMapping("/addData")
	public ResponseEntity<InputEntity>  addData(@RequestBody InputEntity inputEntity){
		InputEntity entity = 
			inputDataService.addData(inputEntity);
			return ResponseEntity.ok(entity);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<InputEntity> deleteData(@RequestBody InputEntity inputEntity) {
        this.inputDataService.deleteData(inputEntity);
        return ResponseEntity.ok(null);
    }
	
	@PutMapping("/update")
	public ResponseEntity<InputEntity> updateData(@RequestBody InputEntity inputEntity){
		this.inputDataService.updateData(inputEntity);
		return ResponseEntity.ok(inputEntity);
	}
}

