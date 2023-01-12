package com.vishnu.core.programs;
class MinAndMaxInArray
{
	public static void main(String[] args)
	{
		int array[]= {2,4,1,9};
		int max=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
		}
		System.out.println("Largest value="+max);
		int[] array1= {2,4,1,9};
		int min=array1[0];
		for(int j=1;j<array1.length;j++)
		{
			if(array1[j]<min)
			{
				min=array1[j];
			}
		}
		System.out.println("Smallest value="+min);	
	}
}

