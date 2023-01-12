package com.vishnu.core.programs;

public class AccessArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create an array
		   int[] age = {12, 4, 5, 2, 5};
		   // access each array elements
		   System.out.println("Accessing Elements of Array:");
		   System.out.println("First Element: " + age[0]);
		   System.out.println("Second Element: " + age[1]);
		   System.out.println("Third Element: " + age[2]);
		   System.out.println("Fourth Element: " + age[3]);
		   System.out.println("Fifth Element: " + age[4]);
		   
		   
		   //Using For Loop
		   
		   int[] age1 = {12, 4, 5};
		   // loop through the array
		   // using for loop
		   System.out.println("Using for Loop:");
		   for(int i = 0; i < age1.length; i++) {
		     System.out.println(age1[i]);
		   }

	}

}
