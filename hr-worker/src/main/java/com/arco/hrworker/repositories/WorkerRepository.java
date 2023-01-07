package com.arco.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arco.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}