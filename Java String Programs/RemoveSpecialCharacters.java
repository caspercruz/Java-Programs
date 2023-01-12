package com.vishnu.core.programs;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "@#@J@#A!!V#A";
		
		//Approach 1 (replaceAll() method)
		String plainStr=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.print(plainStr);
	}

}
