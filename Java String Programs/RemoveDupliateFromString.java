package com.vishnu.core.programs;
import java.util.Arrays;
public class RemoveDupliateFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int[] arr = {1, 2, 3, 2, 3, 4, 5, 6, 7, 5, 6};
		    int length = arr.length;
		    int[] temp = new int[length];

		    for (int i = 0; i < length; i++) {
		      temp[i] = 0;
		    }

		    int k = 0;
		    for (int i = 0; i < length; i++) {
		      if (temp[arr[i]] == 0) {
		        temp[arr[i]] = 1;
		        arr[k] = arr[i];
		        k++;
		      }
		    }

		    // Print the new array
		    System.out.println("Array with no duplicates: " + Arrays.toString(arr));
		  }
}
