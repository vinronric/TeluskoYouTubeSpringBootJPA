package com.vinoth.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinoth.daoreposiroty.AlienRepository;
import com.vinoth.daoreposiroty.EmployeeRepository;
import com.vinoth.demo.Alien;
import com.vinoth.demo.Employee;
import com.zaxxer.hikari.util.SuspendResumeLock;

@Service
@Transactional
public class EmployeeService {
	
	private final EmployeeRepository employeeRepository;

	
	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository=employeeRepository;
	}
	
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	
	public void deleteEmployee(int empid) {
		employeeRepository.deleteById(empid);
	}
	
	public List<Employee> getAllEmployees() {
		System.out.println("getAllEmployees method is called in EmployeeService");
		List<Employee> employees=new ArrayList<Employee>();
		System.out.println("employees size before calling repo findAll() : " + employees.size());
		employees=(List<Employee>) employeeRepository.findAll();
		System.out.println("employees size before calling repo findAll() : " + employees.size());
		System.out.println("employees : " + employees);
		return employees;
	}
	
}
