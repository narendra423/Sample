package com.stg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stg.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{
	
}
