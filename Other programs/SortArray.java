import java.util.Arrays;

class SortArray
{
	public static void main(String args[])
	{
		int[] arr={78,34,1,3,90,-1,-4};
		Arrays.sort(arr);
		System.out.println("array sorted!");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}



/*class SortArray
{
	public static void main(String args[])
	{
	int [] arr=new int[] {78,1,3,90,34,-1,-4};
	System.out.println("Array elements after sorting: ");
	for(int i=0;i<arr.length;i++)
	{
	for(int j=i+1;j<arr.length;j++)
	{
	int temp=0;
	if(arr[i]>arr[j])
	{
	temp=arr[i];
	arr[i]=arr[j]
	arr[j]=temp;
	}
	}
	System.out.println(arr[i]);
	}
	}
}
*/
