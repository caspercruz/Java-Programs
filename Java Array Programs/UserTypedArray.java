package com.vishnu.core.programs;

import java.util.Scanner;

public class UserTypedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Size of array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter the array elements");
		int [] arr=new int [size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("array elements are");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
		
		

	}

}
