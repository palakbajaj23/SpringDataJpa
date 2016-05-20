package com.sdj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sdj.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
