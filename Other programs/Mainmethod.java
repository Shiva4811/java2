import java.util.*;
class Mainmethod
{
	public static void main(String args[])
	{
	int a,b,c;
	float d;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the marks of Maths: ");
	a=sc.nextInt();
	System.out.println("Enter the marks of chemistry: ");
	b=sc.nextInt();
	System.out.println("Enter the marks of physics: ");
	c=sc.nextInt();
	d=a+b+c/3;
	if(d>60)
	{
	System.out.println("A grade");
	}
	if(d>40)
	{
	System.out.println("B grade");
	}
	}
}