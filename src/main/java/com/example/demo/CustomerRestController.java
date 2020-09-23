package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {
String a="sandhya";
	//To bind the method to get request.Post proccesing will happen by dispatcher servlet
	@GetMapping(value="/getCustomer",//--->post-processing request
			produces="application/json"//-->server is produces
			)
	public Customer getCustome() {
		
		Customer c=new Customer();
		//logic
		c.setCid(101);
		c.setName("smith");
		return c;
	}
//	@PostMapping(value="/add",//--->pre-processing request
//			consumes="application/json")
//	public String addCustomer(Customer c) {
//		System.out.println("SpringBootApp2.addCustomer()");
//		System.out.println(c);
//		return "Added Successfully";
//		
	//}
	@PostMapping(value="/add",//--->pre-processing request
			consumes="application/json")
	public String addCustomer() {
		Customer c=new Customer();
	System.out.println("SpringBootApp2.addCustomer()");
		System.out.println(c);
		return "Added Successfully";
		
	}
  
//feature-301
public void m2(){
System.out.println("Hello");

//feature-300
public void m1(){
 
}
}
