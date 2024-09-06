class Indira
{
	void sonDaughter()
	{
	System.out.println("I am the first lady prime minister of India.");
	}
}
class Rajiv extends Indira 
{
	void sonDaughter()
	{
		System.out.println("I am the son of Indira.");
	}
	void Rahul()
	{
		System.out.println("I am the son of Rajiv");
	}
}

class Herierchy
{
	public static void main(String args[])
	{
		System.out.println("I am in the main method.");
		Indira obj=new Indira();
		obj.sonDaughter();

		Rajiv obj1=new Rajiv();
		obj1.sonDaughter();
		obj1.Rahul();
	}
}