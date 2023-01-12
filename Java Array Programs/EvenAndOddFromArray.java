package com.vishnu.core.programs;
import java.util.Scanner;
public class EvenAndOddFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter array Size= ");
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter elements= ");
	        for (int i = 0; i < n; i++) 
	        {
	            a[i] = s.nextInt();
	        }
	        System.out.println("Odd NO= ");
	        for(int i = 0 ; i < n ; i++)
	        {
	            if(a[i] % 2 != 0)
	            {
	                System.out.print(a[i]+" ");
	            }
	        }
	        System.out.println("");
	        System.out.println("Even NO= ");
	        for(int i = 0 ; i < n ; i++)
	        {
	            if(a[i] % 2 == 0)
	            {
	                System.out.print(a[i]+" ");
	            }
	        }
	}
}
