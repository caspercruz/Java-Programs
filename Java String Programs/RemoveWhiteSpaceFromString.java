package com.vishnu.core.programs;

public class RemoveWhiteSpaceFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="j  a  v  a";
		
		String str1=str.replaceAll("\\s","");
		System.out.println(str1);
	}

}
