package com.sdj.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sdj.model.Employee;
import com.sdj.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	private Logger logger = Logger.getLogger(EmployeeController.class);

	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public Employee saveEmployee(@RequestBody Employee employee) {
		logger.info("in save employee");
		return employeeService.saveEmployee(employee);
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String getHello() {
		return "hello";

	}

	/*
	 * @RequestMapping(value = "/getListOfEmployee") public List<Employee>
	 * viewAllEmployee() { List<Employee> listOfEmployee = (List<Employee>)
	 * employeeRepository .findAll(); return listOfEmployee; }
	 * 
	 * @RequestMapping(value = "/employee/{id}",method=RequestMethod.DELETE)
	 * public void deleteEmployee(@PathVariable("id") long id) {
	 * System.out.println("in delete"); employeeRepository.delete(id);
	 * 
	 * 
	 * }
	 */

}
