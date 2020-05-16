package com.funinjava.coreconcept.enums;

public enum Season {

	WINTER ("winter"), SPRING ("spring"),SUMMER("summer"),FALL("fall");
	
	String value;
	
	 Season(String value) {
		this.value= value;
	}
	
	public String getSeason() {
		return value;
	}
	
	
}
