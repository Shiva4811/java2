/* 
inner class can use each and everything of the outer class including private
members.
*/
class MyOuter
{
	private int x=7; //instance var
	public void makeInner() //instance method
	{
	System.out.println(x);
	MyInner in=new MyInner(); //Make an inner instance/object
	in.seeOuter();
	}
	class MyInner
	{
		public void seeOuter()
		{
		System.out.println("outer x is "+x);
		}
	}//inner class end
	public static void main(String args[])
	{
	MyOuter mo=new MyOuter();
	mo.makeInner();
	}
}