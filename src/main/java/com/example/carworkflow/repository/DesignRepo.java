package com.example.carworkflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.carworkflow.model.Design;

@Repository
public interface DesignRepo extends JpaRepository<Design,Integer> {

}
