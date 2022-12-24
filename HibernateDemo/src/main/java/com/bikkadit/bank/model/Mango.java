package com.bikkadit.bank.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Mango {
	
	private int idz;
	private int prize;
	private String variety;
	public int getId() {
		return idz;
	}
	public void setId(int id) {
		this.idz = id;
	}
	public int getPrize() {
		return prize;
	}
	public void setPrize(int prize) {
		this.prize = prize;
	}
	public String getVariety() {
		return variety;
	}
	public void setVariety(String variety) {
		this.variety = variety;
	}
	@Override
	public String toString() {
		return "Mango [id=" + idz + ", prize=" + prize + ", variety=" + variety + "]";
	}
	
	

}
