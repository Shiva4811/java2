class OverDemo3
{
	void Sum(int a, float b)
	{
	System.out.println(a+b);
	}
	void Sum(float b, int a)
	{
	System.out.println(a+b);
	}
	public static void main(String args[])
	{
	OverDemo3 var=new OverDemo3();
	var.Sum(10,4.5f);
	var.Sum(6.6f, 20);
	}
}