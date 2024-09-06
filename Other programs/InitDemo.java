class Student1
{
	Student1()
	{
	System.out.println("This is non param constructor");
	}

	Student1(int num)
	{
	System.out.println("This is param constructor");
	}

	{//IIB block or ananymous block
		System.out.println("I am IIB(instance intialize block) or ananymous block"); 
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
	}
}
class InitDemo
{
	public static void main(String args[])
	{
	Student1 st=new Student1();
	Student1 st1=new Student1(10);
	}
}