class Student2
{
	String name;
	int age;
	void accept(String x, int y)
	{
	name=x;
	age=y;
	}

void display()
{
	System.out.println("Name is "+name);
	System.out.println("Age is "+age);
}
public static void main(String args[])
{
Student2 st1=new Student2();
st1.accept("dd sir",34);
st1.display();

Student2 st2=new Student2();
st2.accept("Hello",22);
st2.display();
	
}
}