class Arrayt
{
	public static void main(String args[])
	{
		int[] arr=new int []{10,20,30};
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int var: arr)
		{
			System.out.print("\n"+var+" ");
		}
	}
}