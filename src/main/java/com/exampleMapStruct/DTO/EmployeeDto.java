package com.exampleMapStruct.DTO;

import com.exampleMapStruct.Validators.UniqueEmailValidator;
import com.exampleMapStruct.Validators.UpdateValidationGroup;
import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeDto {
	
	
	private int id;
	
	@NotBlank(message = "name cannot be null") //annotations are of data-jpa (jakarta) hiberante one's are deprecated

	private String name;
	
	@Min(value = 30,message = "Minimum age should be 30")
	@Max(value = 35,message = "Maximum age should be 35")
	private int age;
	
	@Email
	@NotBlank(message = "email should not be Blank")
	@UniqueEmailValidator(message = "Email must be unique",groups = {UpdateValidationGroup.class})
	private String emailAddress;
	
	
	private int projectId;
	

}
