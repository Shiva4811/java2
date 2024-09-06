class MultiCatchDemo
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
	System.err.println("please do not divide by zero");
	}
	catch(NumberFormatException e)
	{
	System.err.println("Please enter only number");
	}
	catch(Exception e)
	{
	System.err.println("I provide solution for all.");
	}
	}
}