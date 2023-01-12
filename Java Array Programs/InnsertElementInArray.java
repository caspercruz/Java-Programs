package com.vishnu.core.programs;

import java.util.Scanner;

public class InnsertElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, position, x;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements= ");
        n = s.nextInt();
        int a[] = new int[n+1];
        System.out.println("Enter the elements= ");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("Enter the position to insert element= ");
        position = s.nextInt();
        System.out.print("Enter the element to insert= ");
        x = s.nextInt();
        for(int i = (n-1); i >= (position-1); i--)
        {
            a[i+1] = a[i];
        }
        a[position-1] = x;
        System.out.print("Array After insertion= ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.print(a[n]);

	}

}
