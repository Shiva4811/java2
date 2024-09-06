//This demo is for try and catch 
class ExecDemo1
{
	public static void main(String args[])
	{
	try 
	{
	System.out.println("This line is 1.");
	int a=10/0; //it is a risky task

	}
	catch(ArithmeticException ae)
	{
	System.err.println("Please do not divide by 0");
	}
	System.out.println("plz print me......");
	}
}