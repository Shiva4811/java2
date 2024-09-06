//This demo is for throw keyword
import java.util.*;
class ThrowDemo
{
	static void validate(int age)
	{
	try
	{
		if(age<18)
		{
		throw new ArithmeticException("Age must be >18");
		}
		else
		{
			System.out.println("Welcome to vote");
		}
	}
	catch(ArithmeticException ae)
		{
		System.err.println("caught: "+ae.getMessage());
		}
	}
	public static void main(String args[])
	{
	Scanner obj=new Scanner(System.in);
	System.out.println("please enter your age: ");
	int age=obj.nextInt();
	validate(age);
	}
}