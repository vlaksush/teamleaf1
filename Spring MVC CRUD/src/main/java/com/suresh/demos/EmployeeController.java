package com.suresh.demos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	List<Employee> employeeList = new ArrayList();
	
	@Autowired
	EmployeeDAO employeeDAO;
	
	
	@RequestMapping("/home")
	public ModelAndView getAllEmployees() {
		ModelAndView model = new ModelAndView("employee");
		employeeList = employeeDAO.all();
		model.addObject("employeeList",employeeList);
		return model;
	}
	
	@RequestMapping("/display/{id}")
	public ModelAndView getEmployeeById(@PathVariable("id") Integer id) {
		ModelAndView model = new ModelAndView("EmployeeDetail");
		Employee employee = employeeDAO.getEmployeeById(id);
		
		model.addObject("employee",employee);
		
		return model;
		
	}
	
	@RequestMapping("/addForm")
	public ModelAndView addForm() {
		ModelAndView model = new ModelAndView("addEmployee");
		model.addObject("employee",new Employee());
		return model;
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("employee") Employee employee) {
		employeeDAO.saveEmployee(employee);
		System.out.println(employee);
		return new ModelAndView("redirect:/employee/home");
	}
	

	
	@RequestMapping("/editForm/{id}")
	public ModelAndView editEmployee(@PathVariable("id") Integer id) {
		ModelAndView model = new ModelAndView("updateForm");
		Employee employee = employeeDAO.getEmployeeById(id);
		model.addObject("employee",employee);
		return model;
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView updateEmployee(@ModelAttribute("employee") Employee employee) {
		employeeDAO.updateEmployee(employee);
		return new ModelAndView("redirect:/employee/home");
	}
	
	@RequestMapping("/delete/{id}")
	public ModelAndView deleteEmployee(@PathVariable("id") Integer id) {
		Employee employee = employeeDAO.getEmployeeById(id);
		employeeDAO.deleteEmployee(id);
		return new ModelAndView("redirect:/employee/home");
	}
	
	
}
