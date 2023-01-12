package com.vishnu.core.programs;

public class DeleteFirstAndLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Vishnu";
		StringBuilder builder=new StringBuilder(str);
		builder.deleteCharAt(str.length()-1);
		builder.deleteCharAt(0);
		System.out.println("First and Last characters Deleted= "+builder.toString());
	}

}
