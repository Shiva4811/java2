class Student22
{
	String name; //Instance variable
	int age;
	Student22() //Non program constuctor
	{
	name="Shweta Singh";
	age=7;
	}
	void display() //instance method
	{
	System.out.println("Name is "+name);
	System.out.println("Age is "+age);
	}
}//class End

class Student22Test
{
	public static void main(String args[])
	{
	Student22 st=new Student22();
	st.display();
	}
}