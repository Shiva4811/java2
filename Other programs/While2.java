import java.util.*;
class While2
{
	public static void main(String args[])
	{
	char c;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a char: ");
	c=sc.next().charAt(0);
	while(c=='y')
	{
	System.out.println("Hello Good morning");
	System.out.println("enter a char: ");
	c=sc.next().charAt(0);
	}
	}
}