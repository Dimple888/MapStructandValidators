package com.exampleMapStruct.Entity;



import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="emp")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //two tables will be created hibernate will create one table to store the nextVal of id
	private int id;
	
	private String name;
	
	private int age;
	
	private String emailAddress;
	
	private int projectId;
	
	private Date creationDate; //only in entity we have saving into db but it is not coming from ui so writing logic in service

}
