package com.sdj.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sdj.model.Employee;
import com.sdj.repository.EmployeeRepository;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	private Logger logger = Logger.getLogger(EmployeeController.class);

	@RequestMapping(value = "/addEmployee")
	public String addEmployeePage(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "addemployee";
	}

	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		
		employeeRepository.save(employee);
		return "home";
	}

	@RequestMapping(value = "/getListOfEmployee")
	public String viewAllEmployee(Model model) {
		List<Employee> listOfEmployee = (List<Employee>) employeeRepository
				.findAll();
		model.addAttribute("listOfEmployee", listOfEmployee);
		long count = employeeRepository.count();
		logger.info("No of employee :" + count);
		return "viewemployee";
	}

	@RequestMapping(value = "/deleteemployee")
	public String deleteEmployee(@RequestParam("id") int id) {
		System.out.println("in delete");
		employeeRepository.delete((long) id);

		return "home";
	}

}
