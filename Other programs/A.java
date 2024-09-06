interface Inter
{
	int var=10;
	public void m1();
}//interface end
class A implements Inter
{
	@Override
	public void m1()
	{
	System.out.println("overriding m1 method");
	}
	public void m2()
	{
	System.out.println("Originally from A class");
	}
	public static void main(String args[])
	{
	System.out.println(var);
	Inter obj1=new A(); //Okk upcasting 
	obj1.m1(); //okk
	//obj1.m2(); CTE not okk

	A obj2=new A();
	obj2.m1(); //OKK
	obj2.m2(); //Also Okk
	}
}