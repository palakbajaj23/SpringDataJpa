package com.sdj.repository;

import org.springframework.data.repository.CrudRepository;

import com.sdj.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{
	

}
