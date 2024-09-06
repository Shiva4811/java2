class A
{
	A()
	{
		System.out.println("I am in default.");
	}
	A(int a)
	{
		this();
		System.out.println(a);
	}
}
class OverCon
{	public static void main(String args[]){
	A obj=new A(10);
}
}
















/*class A
{
	int a;
	void ex(int a)
	{
		this.a=a;
	}
	void disp()
	{
		System.out.println(this.a);
	}
}
class OverCon
{
	public static void main(String args[])
	{
		A obj=new A();
		obj.ex(10);
		obj.disp();
	}
}*/