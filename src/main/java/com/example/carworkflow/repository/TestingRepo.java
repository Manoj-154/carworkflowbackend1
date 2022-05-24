package com.example.carworkflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.carworkflow.model.Testing;

@Repository
public interface TestingRepo extends JpaRepository <Testing,Integer> {

}
