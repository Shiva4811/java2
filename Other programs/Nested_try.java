//Nested try 10 2
class Nested_try
{
	public static void main(String args[])
	{
	try //outer try
	{
	int a =Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	int result=0;
	
	try //inner try
	{
	result=a/b;
	System.out.println(result);
    }
	//inner try end
	catch(ArithmeticException e)	
	{
	System.out.println("divide by zero");
	}
	}//outer try end
	catch(Exception e)		//outer catch
	{
	System.out.println("incorrect argument type");
	}
	}//main end
	}
