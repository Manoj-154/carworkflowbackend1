package com.example.carworkflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.carworkflow.model.Manufacture;

@Repository
public interface ManufactureRepo extends JpaRepository<Manufacture,Integer> {

}
