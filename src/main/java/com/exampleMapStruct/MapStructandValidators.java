package com.exampleMapStruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.exampleMapStruct.Repository.EmployeeRepo;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories(basePackageClasses = {EmployeeRepo.class})
public class MapStructandValidators {

	public static void main(String[] args) {
		SpringApplication.run(MapStructandValidators.class, args);
	}

}
