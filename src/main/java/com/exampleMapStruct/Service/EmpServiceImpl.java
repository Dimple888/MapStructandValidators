package com.exampleMapStruct.Service;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exampleMapStruct.DTO.EmployeeDto;
import com.exampleMapStruct.Entity.Employee;
import com.exampleMapStruct.Mapper.EmployeePopulator;
import com.exampleMapStruct.Repository.EmployeeRepo;

@Service
public class EmpServiceImpl { 
	
	@Autowired
	EmployeeRepo empRepo;
	
	public Employee saveEmployee(EmployeeDto employeeDto) {
		
		//code to convert dto to entity
		Employee populateEmployee = EmployeePopulator.INSTANCE.populateEmployee(employeeDto);
		Date date=new Date(System.currentTimeMillis()); //new Date() is deprecated so we are passing parameters System.currentTimeMillis()
		populateEmployee.setCreationDate(date);
		return empRepo.save(populateEmployee);
	}
	

}
