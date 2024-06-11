package com.example.Springboot_sequence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository erepo;
	@RequestMapping("/test")
	public String test()
	{
		return "this is test for sequence";
	}
	@RequestMapping("/call")
	public String call()
	{
		return "this is call for call for employeeseq";
	}
	@PostMapping("/save")
	public String save(@RequestBody Employee emp)
	{
		Employee a=new Employee();
		a.setName("tania");
		a.setAge(24);
		a.setAddress("chainpur");
		erepo.save(emp);
		return "data is saved to database";
	}
	@GetMapping("/all")
	public List<Employee>allData()
	{
		return erepo.findAll();
	}
}
