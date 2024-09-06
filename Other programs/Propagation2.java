class Propagation2
{
	public static void main(String args[])
	{
	System.out.println("In Main Method start.");
	try
	{
	m1();
	}
	catch(ArithmeticException ae)
	{
	System.out.println("In main catch.");
	}
	System.out.println("In main Method End.");
	}
	static void m1()
	{
	System.out.println("In m1 Method start.");
	System.out.println(10/0);
	System.out.println("In m1 Method end.");
	}
}