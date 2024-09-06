import java.util.*;
class Student
{
	String x, z;
	int y;
	Student(String name, int age)
	{
	this("Agra"); //current class constructor
	//Student("Agra"); //CTE
	this.x=name;
	this.y=age;
	}
	Student(String address)
	{
	this.z=address;
	}
	void display()
	{
	System.out.println("Name is "+x);
	System.out.println("Age is "+y);
	System.out.println("Address is "+address);
	}
} //class end

class ConstructorOverloading
{
	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your name: ");
	String name=sc.nextLine();

	System.out.println("Enter your age: ");
	int age=sc.nextInt();

	Student st=new Student(name, age);
	st.display();
	}
}