class Parent 
{
	public void disp()
	{
	System.out.println("Hello I am base class Function.");
	}
}//class end

class Anonymous
{
	Parent p=new Parent()
	{
	public void disp() //overriding
	{
	System.out.println("Hello i am child class Function.");
	}
	};
	public static void main(String args[])
	{
	Anonymous obj=new Anonymous();
	obj.p.disp();
	}
}