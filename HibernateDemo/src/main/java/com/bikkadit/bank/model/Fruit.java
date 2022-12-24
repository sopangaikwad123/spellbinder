package com.bikkadit.bank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Fruit {
	@Id
	private int id;
	private String name;
	private String colour;
	private int rate;
	private Mango mango;
	
	public Mango getMango() {
		return mango;
	}
	public void setMango(Mango mango) {
		this.mango = mango;
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
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Fruit [id=" + id + ", name=" + name + ", colour=" + colour + ", rate=" + rate + ", mango=" + mango
				+ "]";
	}
	
	
	
	

}
