package com.claim.entity;

public class Hole {
	
	private String firstOnTheGreen;
	private String closestToThePin;
	private String firstInTheHole;
	public Hole() {
		
	}
	public Hole(String firstOnTheGreen, String closestToThePin, String firstInTheHole) {
		
		this.firstOnTheGreen = firstOnTheGreen;
		this.closestToThePin = closestToThePin;
		this.firstInTheHole = firstInTheHole;
	}
	public String getFirstOnTheGreen() {
		return firstOnTheGreen;
	}
	public void setFirstOnTheGreen(String firstOnTheGreen) {
		this.firstOnTheGreen = firstOnTheGreen;
	}
	public String getClosestToThePin() {
		return closestToThePin;
	}
	public void setClosestToThePin(String closestToThePin) {
		this.closestToThePin = closestToThePin;
	}
	public String getFirstInTheHole() {
		return firstInTheHole;
	}
	public void setFirstInTheHole(String firstInTheHole) {
		this.firstInTheHole = firstInTheHole;
	}
	
	
	
	
	

}
