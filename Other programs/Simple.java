import java.util.*;
class NestedIf
{
	public static void main(String args[])
	{

	String choice;
	int age;
	Scanner sc=new Scanner(System.in);
	choice=sc.nextLine();
	age=sc.nextInt();
	if(choice=="yes")
	{
	if(age>=18)
	{
	System.out.println("Valid voter");
	}
	else
	{
	System.out.println("Invalid voter");
	}
	}
	else
	{
	System.out.println("very good decision");
	}
	}
}