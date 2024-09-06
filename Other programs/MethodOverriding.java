class Employee // Topic=> Method Overriding (When the method of Sub class is same as the method of super class even its prameter)
{
	String fname,lname; //instance variable
	public void disp()//instance method
	{
	System.out.println("First name is : "+fname);
	System.out.println("Last name is : "+lname);
	
	}
}//class End

class FullTimeEmployee extends Employee
{
	int monthlysalary; //instance variable

	public void disp() //overriding
	{
	/*
	System.out.println("First name is : "+fname);
	System.out.println("Last name is "+lname);
	*/
	super.disp(); //it call parent class disp()
	System.out.println("monthly salary is"+monthlysalary);
	}
} //class End

class MethodOverrding
{
	public static void main(String args[])
	{
	FullTimeEmployee fte=new FullTimeEmployee();
	fte.fname="DD";
	fte.lname="Singh";
	fte.monthlysalary=3000;
	fte.disp();
	}
}