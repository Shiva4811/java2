class PromDemo2 //method overloading 
{
	void sum(int a, long b)
	{
	System.out.println(a+b);
	}
	void sum(long a, int b)
	{
	System.out.println(a+b);
	}
	public static void main(String args[])
	{
	PromDemo2 pd=new PromDemo2();
	pd.sum(10L,20);
	}
}