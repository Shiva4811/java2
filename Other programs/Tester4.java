class Parent
{
	public void A()
	{
		System.out.println("Black and white pic.");
	}
}
class Child2 extends Parent
{
	public void disp()
	{
		super.A(); //super keyword is used to refer the method of parent/super class. 
		System.out.println("Colored pic.");
	}
}

class Tester4
{
	public static void main(String args[])
	{
		Child2 obj=new Child2();
		obj.disp();
	}
}