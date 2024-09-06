class Employee // Topic=> Method Overriding 
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

class Tester3
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