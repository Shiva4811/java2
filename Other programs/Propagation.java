class Propagation
{
	public static void main(String args[])
	{
	System.out.println("In main method start.");
	m1();
	System.out.println("In main Method end.");
	}
	static void m1()
	{
	System.out.println("In m1 Method start");
	System.out.println(10/0);
	System.out.println("In m1 Method end.");
	}
}