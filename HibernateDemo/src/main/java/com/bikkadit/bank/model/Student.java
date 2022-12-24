package com.bikkadit.bank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Student_info")
public class Student {
	
	@jakarta.persistence.Id 
	private int Id;
	private String name;
	private String Dept;  
	private String email;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", Dept=" + Dept + ", email=" + email + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
