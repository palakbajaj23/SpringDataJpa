package com.sdj.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdj.model.Employee;
import com.sdj.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		System.out.println("in save employee");
		return employeeRepository.save(employee);
	}

	/*
	 * public Employee saveEmployee(Employee employee) { return
	 * employeeRepository.save(employee);
	 * 
	 * }
	 */

}
