//This demo is for constructor chaining
class Parent
{
	Parent()
	{
	//super();//It calls the object class constructor
	System.out.println("I am Parent Constructor.");
	}
}//class End

class Child extends Parent
{
	Child()
	{
	//super(); //Parent class constructor
	System.out.println("I am child class Constructor.");
	}
}
class Tester6
{
	public static void main(String args[])
	{
	Child obj=new Child();
	}
}