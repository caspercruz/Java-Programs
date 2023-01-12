package com.vishnu.core.programs;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Approach 1
		
		String str="vishnu";
		System.out.println("Entered string "+str);
		int length=str.length();
		char[] arr=str.toCharArray();
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		
		
		//Approach 2
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		//Approach 3
		StringBuffer sb=new StringBuffer(str);
		System.out.println("String length Approach 3 ="+sb.reverse());
		
		//Approach 4
		StringBuilder sbuilder=new StringBuilder(str);
		System.out.println(sbuilder.reverse());
	}
	

}
