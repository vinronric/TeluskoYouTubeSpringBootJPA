package com.vinoth.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.vinoth.demo.Alien;
import com.vinoth.demo.Employee;
import com.vinoth.demo.User;
import com.vinoth.service.AlienService;
import com.vinoth.service.EmployeeService;


//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin()
@RestController
@RequestMapping({ "/employees" })
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private AlienService alienService;

	//private List<Employee> employees = this.getAllEmployees();

	@GetMapping(produces = "application/json")
	public List<Employee> firstPage() {
		List<Employee> employees = this.getAllEmployees();
		System.out.println("firstPage() is called in EmployeeController");
		System.out.println("firstPage() is called in EmployeeController : employees " + employees);
		
		return employees;
	}
	
	@GetMapping(produces = "application/json")
	@RequestMapping({ "/validateLogin" })
	public User validateLogin() {
		return new User("User successfully authenticated");
	}
	
	@DeleteMapping(path = { "/{id}" })
	public void delete(@PathVariable("id") int empid) {
		System.out.println("deleteEmployee() is called in EmployeeController");
		System.out.println("empid : " + empid);
		employeeService.deleteEmployee(empid);
		/*List<Employee> employees = this.getAllEmployees();
		Employee deletedEmp = null;
		for (Employee emp : employees) {
			if (emp.getEmpid().equals(id)) {
				employees.remove(emp);
				deletedEmp = emp;
				break;
			}
		}*/
		System.out.println("deleteEmployee is successfully added into MySQLDB");
		//return deletedEmp;
	}
	
	@PostMapping
	public Employee create(@RequestBody Employee user) {
		System.out.println("createEmployee() is called in EmployeeController");
		//List<Employee> employees = this.getAllEmployees();
		//employees.add(user);
		user.setEmpid(1);
		System.out.println("user from AddEmployee Front Page : " + user);
		employeeService.addEmployee(user);
		System.out.println("Employee is successfully added into MySQLDB");
		return user;
	}

	
	/*@RequestMapping("/addEmployee")
	public ModelAndView addEmployee(ModelAndView mv) {
		System.out.println("addEmployee() method is called in EmployeeController");
		Employee emp1 = new Employee();
		emp1.setName("emp1");
		emp1.setDesignation("manager");
		emp1.setEmpId("1");
		emp1.setSalary(3000);
		employeeService.addEmployee(emp1);

		mv.addObject("success", "Employee Successfully Saved to MYSQL DB");
		List<Employee> employeeList=new ArrayList<Employee>();
		employeeList = employeeService.getAllEmployees();
		mv.addObject("allEmployees", employeeList);
		mv.setViewName("success");
        return mv;
	}*/
	
	public List<Employee> getAllEmployees() {
		System.out.println("getAllEmployees method is called in EmployeeController");
		List<Employee> employeeList=new ArrayList<Employee>();
		System.out.println("employeeService : " + employeeService);
		System.out.println("alienService : " + alienService);
		employeeList = employeeService.getAllEmployees();
		System.out.println("employeeList : " + employeeList);
		System.out.println("employeeList.size : " + employeeList.size());
		return employeeList;
	}
	
	/*private static List<Employee> createList() {
		List<Employee> tempEmployees = new ArrayList<>();
		Employee emp1 = new Employee();
		emp1.setName("emp1");
		emp1.setDesignation("manager");
		emp1.setEmpId("1");
		emp1.setSalary(3000);

		Employee emp2 = new Employee();
		emp2.setName("emp2");
		emp2.setDesignation("developer");
		emp2.setEmpId("2");
		emp2.setSalary(3000);
		
		Employee emp3 = new Employee();
		emp3.setName("emp3");
		emp3.setDesignation("programmer");
		emp3.setEmpId("3");
		emp3.setSalary(3000);
		
		tempEmployees.add(emp1);
		tempEmployees.add(emp2);
		tempEmployees.add(emp3);
		return tempEmployees;
	}*/

}
