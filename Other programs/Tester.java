//This demo is for interface implementation
interface Inter
{
	public static final int FEES=3000;
	public abstract void disp();
}//interface end

class Tester implements Inter
{
	public void disp()
	{
	System.out.println("Now I have the body");
	}
	public static void main(String args[])

	{
	System.out.println("The Fees is "+FEES);
	Tester obj=new Tester(); //1
	obj.disp();

	Inter obj1=new Tester();	//2 Upcasting
	obj1.disp();
	/*
	Inter obj2=new Inter(); //3 CTE
	obj2.disp();
	*/
	}
}