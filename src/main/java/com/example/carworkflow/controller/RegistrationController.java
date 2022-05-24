package com.example.carworkflow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.carworkflow.repository.RegistrationRepo;

@RestController
public class RegistrationController {
	
	@Autowired
	
	RegistrationRepo rrepo;

	
}
