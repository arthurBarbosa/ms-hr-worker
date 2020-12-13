package com.abcode.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abcode.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
