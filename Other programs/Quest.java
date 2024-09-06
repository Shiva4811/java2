import java.util.*;
class Quest
{
	public static void main(String args[])
	{
	int n;
	int choice;
	Scanner sc=new Scanner(System.in);
	for(int i=1; i<=5;i++)
	{
	System.out.println("Enter a number: ");
	n=sc.nextInt();
	if(n%2==0)
	{
	System.out.println("Even Number");
	break;
	}
	else{
	System.out.println("Odd number");
	System.out.println("1 to retry. 0 to exit");
	
	choice=sc.nextInt();
	if(choice==0)
	{
		break;
	}
	}
	}

	}
}