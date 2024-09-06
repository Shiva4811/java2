class OverDemo2
{
	void sum(int a, int b)
	{
	System.out.println("The sum of integer type is: "+(a+b));
	}
	void sum(float a, float b)
	{
	System.out.println("The sum of float type numbers is: "+(a+b));
	}
	public static void main(String args[])
	{
	OverDemo2 obj=new OverDemo2();
	obj.sum(10,20);
	obj.sum(10.5f,4.8f);
	}
}