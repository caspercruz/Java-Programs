package com.vishnu.core.programs;

public class ToUpperLowerString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "java is best";
        System.out.println("Lower case string is= " + input);
        char strArr[] = input.toCharArray();
        for (int i = 0; i < strArr.length; i++) 
        {
        
        	if (strArr[i] >= 'a' && strArr[i] <= 'z') 
        	{
        		strArr[i] = (char) ((int) strArr[i] - 32);
            }
        }
        System.out.print("Upper case string is : ");
        for (int i = 0; i < strArr.length; i++) 
        {
                System.out.print(strArr[i]);
        }

	}

}
