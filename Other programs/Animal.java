abstract class Parent
{
	Parent()
	{
		System.out.println("I am parent class Constructor.");
	}
}
class Child extends Parent
{
	Child()
	{
		super();
		System.out.println("I am Child class Constructor");
	}
	public static void main(String args[])
	{
		Child obj=new Child();
	}
}