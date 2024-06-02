package com.exampleMapStruct.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.exampleMapStruct.DTO.EmployeeDto;
import com.exampleMapStruct.Entity.Employee;

@Mapper //thuis will come due to dependency we added
public interface EmployeePopulator {
	
	EmployeePopulator INSTANCE = Mappers.getMapper(EmployeePopulator.class); //as it is interface we can't create object so will use
	//this instance
	
	@Mapping(target = "id",ignore = true)
	@Mapping(target = "creationDate",ignore = true)
	Employee populateEmployee(EmployeeDto employeeDto);

}
