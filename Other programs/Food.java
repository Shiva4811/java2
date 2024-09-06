//Flavour two an Anonymous Inner class implements interface
interface Cookable
{
	public abstract void cook();
}
class Food
{
	Cookable c =new Cookable()
	{
	public void cook() //overriding
	{
	System.out.println("anonymous cookable implementer.");
	}
	};
	public static void main(String args[])
	{
	Food obj=new Food();
	obj.c.cook();
	}
}