package com.capg.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.springboot.model.Trainee;

public interface TraineeRepo extends JpaRepository<Trainee,Integer>{

}
