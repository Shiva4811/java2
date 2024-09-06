import java.util.*;
class Numer
{
	public static void main(String args[])
	{
	int i, sum=0;
	float avg; 
	int[] arr=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the marks of 5 Subjects out of 100: ");
	
	for( i=0;i<arr.length; i++)
	{
		arr[i]=sc.nextInt();	
	}
	System.out.println("The marks of the 5 subjects are: ");
	for(int j=0;j<5;j++)
	{
		System.out.print(" "+arr[j]+" ");
	}
	for(int k=0;k<5;k++)
	{
		sum=sum+arr[k];
	}
	avg=sum/5;
	System.out.println("\nThe average marks is: "+avg);
	
	}
}