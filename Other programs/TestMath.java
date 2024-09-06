class A
{
	int a, b, c;//instance variables
	void add()
	{
		a=10; b=20;
		c=a+b;
		System.out.println("The addition of two numbers is: "+c);
	}
	void sub()
	{
		a=10; b=20;
		c=a-b;
		System.out.println("The subtraction of the two numbers is: "+c);
	}
	

	
}
class B extends A
{
	void mult()
	{
		a=10;  b=20;
		c=a*b;
		System.out.println("The Multiplication of two numbers is: "+c);
	}
}

class C extends B 
{	
	void Div()
	{	
	a=10;  b=20;
	c=a/b;
	System.out.println("The Divison of two numbers is: "+c);
}
}
class TestMath
{
	public static void main(String args[])
	{
		C obj=new C();
		obj.Div();
		obj.sub();
		obj.mult();
		obj.add();
	}
}