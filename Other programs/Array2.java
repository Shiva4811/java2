class Arrayt
{
	public static void main(String args[])
	{
	int[] arr=new int[]{10,30,20};
	System.out.println("Using simple for loop");
	for(int i=0;i<arr.length;i++)
	{
	System.out.println(arr[i]);
	}
	for(int var: arr)
	{
		System.out.print(var+"\t");
	}
	}
}