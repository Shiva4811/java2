class Outer1
{
	static int data=30; //static variable
	int var1=20;
	static void myMethod()
	{
	System.out.println("Outer static method");
	}
	static class Inner
	{
	static void msg()
	{
	System.out.println("data is "+data); //okk
	//System.out.println("var1 is "+var1); //CTE
	}
	void show()
	{
	System.out.println("Hello I am non Static show");
	}
	}//inner class end
	public static void main(String args[])
	{
	System.out.println(data); //Okk
	myMethod();//Okk
	//msg(); //CTE
	Inner.msg(); //okk
	//Inner.show(); //CTE
	Inner obj=new Inner();
	obj.show();
	}
}//outer class end