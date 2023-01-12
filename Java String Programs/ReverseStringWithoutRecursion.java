package com.vishnu.core.programs;

public class ReverseStringWithoutRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original="Vishnu Raveendran";
		String reversed=" ";
		for(int i=0;i<original.length();i++)
		{
			reversed=original.charAt(i)+reversed;
		}
		System.out.println(reversed);

	}

}
