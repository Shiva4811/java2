import java.util.*;
class Student44
{
	String name;
	int age;
	Student44(String n,int a) //parametrized contructor
	{
	name=n;
	age=a;
	}
	void display()
	{
	System.out.println("Name is "+name);
	System.out.println("Age is "+age);
	}
}//class End
 class Student44Test
 {
 	public static void main(String args[])
 	{
 	Scanner sc=new Scanner(System.in);
 	System.out.println("Enter Your Name");
 	String var1=sc.nextLine();
 	System.out.println("Enter your age: ");
 	int var2=sc.nextInt();

 		Student44 st1=new Student44(var1,var2);
 		//or
 		//Student44 st1=new Student44("DD",36)
 		st1.display();
 	}
 }