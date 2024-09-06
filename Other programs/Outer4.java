//This demo is for method local inner class
class Outer4
{
	int x=4;
	static int y=20;
	void display() //Method
	{
				class Inner //Method local inner class
				{
				public void show()
				{
				System.out.println(x);
				System.out.println(y);
				}
				}//Method local inner class end

				Inner i=new Inner();
				i.show();
	}//Method end
	public static void main(String args[])
	{
	Outer4 o =new Outer4();
	o.display();
	}
}