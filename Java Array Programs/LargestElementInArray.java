public lass LargestElementInArray 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		for(int i=1;i<array.length;i++)
		{
			if(array[i]<min)
			{
				min=array[i];
			}
		}
		System.out.println("Largest value="+min);		
}