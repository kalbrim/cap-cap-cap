package com.claim.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="player")
public class Player {
	
	@Id
	@Column(name="name")
	private String name;
	
	
	
	
	@Column(name="number_of_bingos")
	private Integer numberOfBingos;
	
	@Column(name="number_of_bangos")
	private Integer numberOfBangos;
	
	@Column(name="number_of_bongos")
	private Integer numberOfBongos;
	
	@Column(name="total")
	private Integer total;
	
	
	public void addBingo() {
		numberOfBingos++;
	}
	
	public void addBango() {
		numberOfBangos++;
	}
	
	public void addBongo() {
		numberOfBongos++;
	}
	
	
	public Player() {
		
	}
	
	public Player(String name) {
		this.name = name;
		
	}
	
	//adding compareTo
	public int compareTo(Player player) {
		int res = 0;
		if (this.getTotal() < player.getTotal()) {
			res = -1;
		}
		if (this.getTotal() > player.getTotal()) {
			res = 1;
		}
		return res;
	}
	
	public int getTotal() {
		total = numberOfBingos + numberOfBangos + numberOfBongos;
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumberOfBingos() {
		return numberOfBingos;
	}

	public void setNumberOfBingos(Integer numberOfBingos) {
		this.numberOfBingos = numberOfBingos;
	}

	public Integer getNumberOfBangos() {
		return numberOfBangos;
	}

	public void setNumberOfBangos(Integer numberOfBangos) {
		this.numberOfBangos = numberOfBangos;
	}

	public Integer getNumberOfBongos() {
		return numberOfBongos;
	}

	public void setNumberOfBongos(Integer numberOfBongos) {
		this.numberOfBongos = numberOfBongos;
	}


	
	
	


	
	
	

}
