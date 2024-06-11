package com.example.Springboot_sequence;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity(name="employeeseq")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="employeeseq_generator")
	@SequenceGenerator(name="employeeseq_generator",initialValue=12345,allocationSize=1,sequenceName="employeeseq_gen_seq")
	int id ;
	String name;
	int age;
	String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
