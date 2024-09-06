class Indira
{
	void nepo()
	{
	System.out.println("I was the first lady prime minister of India.");
	}	
}//class End

class Rajiv extends Indira
{
	void father()
	{
	System.out.println("I am the son of Indira.");
	}
}
class Rahul extends Rajiv
{
	void son()
	{
	System.out.println("I am the son of Rajiv.");
	}
}
class TestNepo
{
	public static void main(String args[])
	{
	Rahul ar=new Rahul();
	ar.son();
	ar.father();
	ar.nepo();
	}
}