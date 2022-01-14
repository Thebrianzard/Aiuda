package com.brian.casouso.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.brian.casouso.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

	
	public Optional<Employee> findByfirstName(String firstname);
}
