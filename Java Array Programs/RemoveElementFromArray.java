package com.vishnu.core.programs;

import java.util.Arrays;

public class RemoveElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{2,3,1,5,6};
        int[] arr_new = new int[arr.length-1];
        int j=3;
        for(int i=0, k=0;i<arr.length;i++){
            if(i!=j){
                arr_new[k]=arr[i];
                k++;
            }
        }
        System.out.println("Before= " + Arrays.toString(arr));
        System.out.println("After= " + Arrays.toString(arr_new));
	}
}
