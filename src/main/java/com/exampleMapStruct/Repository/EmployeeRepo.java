package com.exampleMapStruct.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exampleMapStruct.Entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
	
	List<Employee> findByEmailAddress(String emailAddress);

}
