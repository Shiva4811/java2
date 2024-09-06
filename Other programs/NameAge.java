import java.util.*;
class NameAge
{
	int i;
	String j; //instance variable
	NameAge(int i, String j) //Constructor and inside the paranthesis are local var.
	{
	this.i=i; 
	this.j=j;
	}
	void display()
	{
	System.out.println("age is : "+this.i);
	System.out.println("name is: "+this.j);
	}
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter your age: ");	
	int age=sc.nextInt();
	System.out.println("Enter your name: ");
	String name=sc.next();

	NameAge Ar=new NameAge(age,name);
	Ar.display();
	

	}
}