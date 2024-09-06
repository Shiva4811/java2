//this demo is for the finally block
//java finally Demo 10 2
class FinallyDemo
{
	public static void main(String args[])
	{
	try
	{
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	int c=a/b;
	System.out.println(c);
	}
	catch(ArithmeticException e)
	{
	System.err.println("AE "+e.getMessage());
	}
	finally
	{
	System.out.println("Bye");
	}
	}
}