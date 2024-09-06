class OverDemo
{
	OverDemo(int i, int j) //constructor ....its name is same as its class name
	{
	System.out.println("The sum of the two numbers is: "+(i+j));
	}
	void sum(int i, int j, int k)
	{
	System.out.println("The sum of three number is: "+(i+j+k));
	}


	public static void main(String args[])
	{
	OverDemo var=new OverDemo(10,20);
	var.sum(10,20,30);
	}
}