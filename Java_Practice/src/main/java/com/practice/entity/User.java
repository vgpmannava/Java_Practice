package com.practice.entity;

import java.time.LocalDate;

public class User {
	
	private int id;
	private String name;
	private LocalDate joinedOn;

	public User(){
		System.out.println("User constructor for testing");
	}
	
	public User(int id, String name, LocalDate joinedOn) {
		super();
		this.id = id;
		this.name = name;
		this.joinedOn = joinedOn;
	}
	
		
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
	public LocalDate getJoinedOn() {
		return joinedOn;
	}
	public void setJoinedOn(LocalDate joinedOn) {
		this.joinedOn = joinedOn;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", joinedOn=" + joinedOn + "]";
	}	
	
	

}
