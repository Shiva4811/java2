import java.util.*;
class Ladder
{
	public static void main(String args[])
	{
	int num;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number:");
	num=sc.nextInt();
	if(num>0)
	{
	System.out.println("+ve");
	}
	else if(num<0)
	{
	System.out.println("-ve");
	}
	else
	{
	System.out.println("zero");
	}
	}
}