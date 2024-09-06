class A
{
	
}

class B extends A
{
	
}
class C
{}
class Parent
{
	public A disp() //A
	{
	System.out.println("Hello");
	return new A();
	}
}
class Child5 extends Parent
{
	public B disp() //co variant return type
	{
		super.disp();
	System.out.println("hi");
	return new B();
	}
}
class Tester5
{
	public static void main(String args[])
	{
	Child5 s = new Child5();
	s.disp();
	}
}