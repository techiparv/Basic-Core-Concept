package com.funinjava.coreconcept;

final class SomeClass {
	
}

//above final call can not be extend
/*
 * class ExtendedClass extends SomeClass { }
 */ 
class SomeClass1 {
	
	final void finalMethod( int i) {};
}

class ExtendedClass1 extends SomeClass1 {

	/* can not override
	 * @Override public void finalMethod(final int i) {
	 * 
	 * }
	 */
}


public class FinalNonAccessModifer {

	public static void main(String[] args) {

	}

}
