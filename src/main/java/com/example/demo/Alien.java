package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Alien {
	private int id;
	private String name;
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
	
	public void show()
	{
		System.out.println("It is in the test class>>");
	}
}
