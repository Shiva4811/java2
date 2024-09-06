class PropDemo2
{
	void method3()//throws ClassNotFoundException
	{
	Class.forName("Fake class.");
	}
	void method2() throws ClassNotFoundException
	{
	method3();
	}
	void method1()
	{
					try
					{
						method2();
					}
					catch(Exception e)
					{
							System.out.println("Excpetion handled"+e.getMessage());
					}
	}
	public static void main(String args[])
	{
		PropDemo2 obj=new PropDemo2();
		obj.method1();
		System.out.println("Normal flow.");
	}
}