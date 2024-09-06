class Array
{
	public static void main(String args[])
	{
	int[] age=new int[]{10,20,30};
	System.out.println("Using basic for loop");
	for(int i=0;i<age.length;i++)
	{
		System.out.print(age[i]+"\t");
	}
	System.out.println("\nUsing Enhanced or for-each loop");
	for(int var: age)
	{
		System.out.print(var+"\t");
	}
	}
}