//this demo is for static nested class
public class Outer
{
	int x=10; //instance variable
	static int y=20;//class variable
	static class Inner
	{
				void show()
				{
				System.out.println(y);
				}
	}//nested class end
		public static void main(String args[])
		{
		System.out.println(y);
		Inner i=new Inner();
		i.show();
		}

}