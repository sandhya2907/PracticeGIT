package com.example.demo;

import org.springframework.stereotype.Controller;

@Controller
public class Customer {
	private Integer cid;
	private String name;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + "]";
	}

}
