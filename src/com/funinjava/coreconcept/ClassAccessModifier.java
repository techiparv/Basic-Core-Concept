	package com.funinjava.coreconcept;
	
	public class ClassAccessModifier {
	
		public static void main(String[] args) {
			//same package
			Example example = new Example();
			example.defaultMethod();
			example.defaultMethod();
			example.protectedMethod();
			// example.privateMethod();// illegal
	
		}
	
	}
