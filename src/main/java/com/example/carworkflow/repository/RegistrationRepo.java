package com.example.carworkflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.carworkflow.model.Registration;
@Repository
public interface RegistrationRepo extends JpaRepository<Registration,String> {

}
