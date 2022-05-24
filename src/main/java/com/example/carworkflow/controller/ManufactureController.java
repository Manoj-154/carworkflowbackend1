package com.example.carworkflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.example.carworkflow.model.Manufacture;

import com.example.carworkflow.repository.ManufactureRepo;

public class ManufactureController {

	@Autowired
	public ManufactureRepo mrepo;
	
	@PostMapping("addWork")
	public Manufacture addWork( @RequestBody Manufacture manufacture ) {
		return mrepo.save(manufacture);
	}
	
	@GetMapping("getWork")
	public List<Manufacture > getWork(){
		return mrepo.findAll() ;	
	}
	@GetMapping("getWorkById/{id}")
	public Manufacture getWorkById(@PathVariable int id) {
		return mrepo.findById(id).orElse(null);
	}
	
	@DeleteMapping("deleteWork/{id}")
	public String deleteWork(@PathVariable int id) {
		mrepo.deleteById(id);
		return "workflow is deleted";
	}
	
	@PutMapping ("updateWork/{id}")
	public Manufacture updateWork(@RequestBody Manufacture manufacture) {
		Manufacture existingWork=mrepo.findById(manufacture.getId()).orElse(manufacture);
		existingWork.setWork(manufacture.getWork());
		return mrepo.save(existingWork);
	}
}
