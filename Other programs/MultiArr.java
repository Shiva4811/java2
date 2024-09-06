class MultiArr
{
	public static void main(String args[])
	{
		int[][] arr= new int [3][5];

		System.out.println("The number of rows: "+arr.length);
		System.out.println("The number of columns in first row: "+arr[0].length);
		System.out.println("The number of columns in second row: "+arr[1].length);
		for(int i=0;i<3;i++)
		{
			System.out.println("\nStarting row: "+(i+1));
			for(int j=0;j<5;j++)
			{
				arr[i][j]=i*j;
				System.out.print(arr[i][j] +" ");
			}
		} 
	}
}