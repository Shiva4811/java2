class Propagation1
{
	public static void main(String args[])
	{
	System.out.println("In Main Method start.");
	m1();
	System.out.println("In Main Method end.");
	}
	static void m1()
	{
	try
	{
	System.out.println("In m1 method start.");
	System.out.println(10/0);
	System.out.println("In m1 method end.");
	}
	catch(ArithmeticException ae)
	{
	System.out.println("In m1 catch.");
	}
	}//m1 method end
}