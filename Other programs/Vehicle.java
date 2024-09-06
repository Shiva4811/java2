interface Vehicle
{
	public abstract void windows();
	public abstract void ac();
}
class Car implements Vehicle
{
	public void windows()
	{
	System.out.println("Car must have 4 Windows.");
	}
	public void ac()
	{
	System.out.println("Ac is required in car.");
	}
}
class Truck implements Vehicle
{
	public void windows()
	{
	System.out.println("Truck must have the two windows.");
	}
	public void ac()
	{
	System.out.println("Ac is not required in Truck.");
	}
}
abstract class Bus implements Vehicle
{
	public void windows()
	{
	System.out.println("Bus must have 25 windows.");
	}
}
class CityBus extends Bus
{
	public void ac()
	{
	System.out.println("Ac is not required.");
	}
}
class StateBus extends Bus
{
	public void ac()
	{
	System.out.println("Ac is required.");
	}
}
class Tester
{
	public static void main(String args[])
	{
	Truck obj1=new Truck();
	obj1.windows();
	obj1.ac();
	}
}