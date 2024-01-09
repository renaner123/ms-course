package com.springboot.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}