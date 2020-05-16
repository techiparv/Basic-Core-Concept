package com.funinjava.coreconcept.enums;

import java.util.Arrays;

public class CheckEnum {

	public static void main(String[] args) {

		  System.out.println(Season.valueOf("FALL"));
		  System.out.println(Season.SPRING);
		  System.out.println(Season.SPRING.ordinal());
		  System.out.println(Arrays.toString(Season.values()));
		 
	}

}
