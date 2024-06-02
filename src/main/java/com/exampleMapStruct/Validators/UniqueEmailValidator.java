package com.exampleMapStruct.Validators;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({ElementType.FIELD,ElementType.METHOD,ElementType.TYPE,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {UniqueEmailValidation.class} )
public @interface UniqueEmailValidator {
	
	//error message
	public String message() default "Invalid email Address";
	
	//represents group of constraints
	 public Class<?>[] groups() default {};
	
	//represents additional info about annotations
	public Class<? extends Payload>[] payload() default{};
	
	

}
