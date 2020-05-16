package com.funinjava.coreconcept.package2;

import com.funinjava.coreconcept.Example;

public class CheckClassAccessModifier {

	public static void main(String[] args) {

		//allowed class modifiers are- public,abstract,final
		Example example = new Example();//public 
		
		//Example example = new Example();//default can not 
	}

}
