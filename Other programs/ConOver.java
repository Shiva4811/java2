import java.util.*;
class Next
{
	String x, y;
	int z;
	Next(String name, int age)
	{
	this("Agra");
	this.x=name;
	this.z=age;
	}
	Next(String address)
	{
	this.y=address;
	}
	void display()
	{
	System.out.println("Name is: "+x);
	System.out.println("Age is: "+z);
	System.out.println("Address is: "+y);
	}
}

class ConOver
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name: ");
	String name=sc.nextLine();

	System.out.println("Enter your age: ");
	int age=sc.nextInt();

	Next obj=new Next(name, age);
	obj.display();
	}
}