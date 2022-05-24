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

import com.example.carworkflow.model.Design;
import com.example.carworkflow.repository.DesignRepo;



@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders="*")
public class DesignController 
{	
	@Autowired
	public DesignRepo drepo;
	
	@PostMapping("addWork")
	public Design addWork( @RequestBody Design design ) {
		return drepo.save(design);
	}
	
	@GetMapping("getWork")
	public List<Design > getWork(){
		return drepo.findAll() ;	
	}
	@GetMapping("getWorkById/{id}")
	public Design getWorkById(@PathVariable int id) {
		return drepo.findById(id).orElse(null);
	}
	
	@DeleteMapping("deleteWork/{id}")
	public String deleteWork(@PathVariable int id) {
		drepo.deleteById(id);
		return "workflow is deleted";
	}
	
	@PutMapping ("updateWork/{id}")
	public Design updateWork(@RequestBody Design design) {
		Design existingWork=drepo.findById(design.getId()).orElse(design);
		existingWork.setWork(design.getWork());
		return drepo.save(existingWork);
	}
}
