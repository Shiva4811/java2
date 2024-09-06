class Student
{
	String name;
	int age;		//These are insatance variables
	static String cname="infomatics";	//class variables
	void disp()
	{
	System.out.println("Name is "+name);
	System.out.println("Age is "+age);
	System.out.println("The Centre is "+cname);
	System.out.println("");
	}
}//class end

class StaticDemo
{
	public static void main(String args[])
	{
	Student s1=new Student();
	s1.name="DD";
	s1.age=33;

	Student s2=new Student();
	s2.name="Dev";
	s2.age=2;

	s1.disp();
	s2.disp();
	}
}