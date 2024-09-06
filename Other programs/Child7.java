abstract class Parent 
{
	Parent()
	{
	System.out.println("I am Constructor of Parent.");
	}
}

class Child7 extends Parent
{
	Child7()
	{
	super(); // It invokes the Parent class constructor
	System.out.println("Child constructor");
	}
	public static void main(String args[])
	{
	Child7 obj=new Child7();
	}
}