package com.exampleMapStruct.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exampleMapStruct.DTO.EmployeeDto;
import com.exampleMapStruct.Entity.Employee;
import com.exampleMapStruct.Service.EmpServiceImpl;
import com.exampleMapStruct.Validators.UpdateValidationGroup;

import jakarta.validation.Valid;

@RestController 
//RestController simplifies RESTful service creation by combining Controller and ResponseBody, 
//automatically serializing method return values into JSON or XML for the client.
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmpServiceImpl empServiceImpl;
	
	@PostMapping("/add") //@Valid is changes to @Validated if we are using a group so it validates only for this group
	//public ResponseEntity<Employee> addEmployee(@Validated(UpdateValidationGroup.class) @RequestBody EmployeeDto employeeDto){
		public ResponseEntity<Employee> addEmployee(@Valid @RequestBody EmployeeDto employeeDto){
		return new ResponseEntity<>(empServiceImpl.saveEmployee(employeeDto),HttpStatus.CREATED);
		
		
	}

}
