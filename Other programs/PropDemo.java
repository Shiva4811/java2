//prg of Exception propagation
class PropDemo
{
	void Method3()
	{
	int num=10/0;
	}
	void Method2()
	{
	Method3();
	}
	void Method1()
	{
						try
						{
						Method2();
						}
						catch(Exception e)
						{
						System.out.println("Exception Handled."+e.getMessage());
						}
	}
	public static void main(String args[])
	{
				PropDemo obj=new PropDemo();
				obj.Method1();
				System.out.println("Normal Flow.");
	}
}