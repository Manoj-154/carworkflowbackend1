package com.example.carworkflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.carworkflow.model.Testing;
import com.example.carworkflow.repository.TestingRepo;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders="*")
public class TestingController {

	@Autowired
	public TestingRepo trepo;
	
	@PostMapping("addTestWork")
	public Testing addTestWork( @RequestBody Testing testing ) {
		return trepo.save(testing);
	}
	
	@GetMapping("getTestWork")
	public List<Testing > getTestWork(){
		return trepo.findAll() ;	
	}
	@GetMapping("getTestWorkById/{id}")
	public Testing getTestWorkById(@PathVariable int id) {
		return trepo.findById(id).orElse(null);
	}
	
	@DeleteMapping("deleteTestWork/{id}")
	public String deleteTestWork(@PathVariable int id) {
		trepo.deleteById(id);
		return "workflow is deleted";
	}
	
	@PutMapping ("updateTestWork/{id}")
	public Testing updateTestWork(@RequestBody Testing testing) {
		Testing existingWork=trepo.findById(testing.getId()).orElse(testing);
		existingWork.setWork(testing.getWork());
		return trepo.save(existingWork);
	}
}
