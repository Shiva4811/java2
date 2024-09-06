abstract class Animal
{
	public void disp()
	{
	System.out.println("I provide color.");
	}
	public abstract void foodHabbit();
}//class end

class Tester extends Animal
{
	public void foodHabbit()//overriding
	{
	System.out.println("Animal can eat meat and plant.");
	}
	public static void main(String args[])
	{
	//Animal obj=new Animal();//CTE

	Tester obj1=new Tester();
	obj1.disp();
	obj1.foodHabbit();

	Animal obj2=new Tester();//upcasting
	obj2.disp();
	obj2.foodHabbit();
	}
}