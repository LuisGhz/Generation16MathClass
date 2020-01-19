package com.exercise16mathclass.app;

import java.lang.Math;

public class MathematicsOperation 
{
	
	public static void main(String[] args) 
	{
		
		System.out.println("e value:" + Math.E);
		System.out.println("pi value: " + Math.PI);
		System.out.println("Absolute value of -2.15 is " + Math.abs(-2.15));
		System.out.println("The cube root of 27 is " + Math.cbrt(27));
		System.out.println("The round of 3.76 " + Math.round(3.76));
		System.out.println("The round ceil of 3.76 " + Math.ceil(3.76));
		System.out.println("The round floor of 3.76 " + Math.floor(3.76));
		System.out.println("Increment of 5 " + Math.incrementExact(5));
		System.out.println("Decrement of 5 " + Math.decrementExact(5));
		System.out.println("Power value of 3 Euler is " + Math.exp(3));
		System.out.format("Which is bigger? %.2f or %.2f: %.2f \n", 3.2, 5.5, Math.max(3.2, 5.5));
		System.out.println("Sin of 0 degrees is: " + Math.sin(0));
		System.out.println("Sin of PI/2 degrees is: " + Math.sin(Math.PI/2));
		System.out.println("Sin of 0 cos is: " + Math.cos(0));
		System.out.println("Sin of PI/2 cos is: " + Math.cos(Math.PI/2));
	}

}
