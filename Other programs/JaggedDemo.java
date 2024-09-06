class JaggedDemo
{
	public static void main(String args[])
	{
	int[][] arr=new int[3][];

	arr[0] = new int[5];
	arr[1] = new int[3];
	arr[2] = new int[2];

	System.out.println("The number of rows are: "+arr.length);
	System.out.println(arr[0].length + "\t" +arr[1].length+"\t"+arr[2].length);
	}
}