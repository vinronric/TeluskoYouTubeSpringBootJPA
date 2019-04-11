package com.vinoth.daoreposiroty;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.vinoth.demo.Alien;
import com.vinoth.demo.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

	@Override
    @Transactional
    Iterable<Employee> findAll();
}
