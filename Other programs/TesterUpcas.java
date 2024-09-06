class Parent 
{
	public void show()
	{
		System.out.println("From Parent!");
	}
}
class Child extends Parent
{
	public void show() //method overriding, as the method of the parent class and child class are same.
	{
		super.show();//super keyword is used to call the statements from parent class or super class
	System.out.println("From Child!");
	}
}
class TesterUpCas
{
	public static void main(String args[])
	{
	Parent c=new Child();//Upcasting -Upcasting is when you treat an object of a child class as if it were an object of the parent class.
	//child c=new Parent(); //down casting - this is not possible
	c.show();

	}
}