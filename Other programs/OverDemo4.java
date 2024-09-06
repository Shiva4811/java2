class OverDemo4
{
	public static void main(int a)
	{
		System.out.println(a);
	}
	public static void main(String args[])
	{
		System.out.println("I am in the first method.");
	main(10);
	OverDemo4.main(29);
	OverDemo4 var=new OverDemo4();
	var.main(19);
	}
}