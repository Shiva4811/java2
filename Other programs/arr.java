class arr
{
	public static void main(String args[])
	{
	int[] age= new int[]{10,20,30};
	// Using for loop
	for(int i=0;i<age.length;i++)
	{
	System.out.print(age[i]+"\t");
	}

	//using for each loop
	for(int var: age)
	{
		System.out.print("\n");
	System.out.print(var+"\t");
	}

	}
}