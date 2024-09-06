//Regular inner class Demo
class Outer2
{
	int x=10; //instance variable
	static int y=20;

	class Inner
	{
	void show()
	{
	System.out.println(x);
	System.out.println(y);
	}
	}//class End
	public static void main(String args[])
	{
	Outer2 o =new Outer2();
	System.out.println(o.x); //10
	//Outer2.Inner i=o.new Inner();
	//i.show();

	Outer2.Inner i=new Outer2().new Inner();
	i.show();

	//new Outer2().new Inner().show();
	}
}