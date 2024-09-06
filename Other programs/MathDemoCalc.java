import java.util.*;
class MathDemoCalc
{
	public static void main(String args[])
	{	

		int n,a,b,result;
	
		Scanner sc= new Scanner(System.in);
		String choice;
		choice=sc.nextLine();

		while(choice!="no")
		{
			System.out.println("Press 1 for addition, Press 2 for Subtraction");
			n=sc.nextInt();
			switch(n)
			{
			case 1:
			{
				System.out.println("Enter first Number: ");
				a=sc.nextInt();
				System.out.println("Enter second Number: ");
				b=sc.nextInt();
				result=a+b;
				System.out.println("The Result is : "+result);
				break;
			}
			case 2:
			{
				System.out.println("Enter first Number: ");
				a=sc.nextInt();
				System.out.println("Enter second Number: ");
				b=sc.nextInt();
				result=a-b;
				System.out.println("The Result is : "+result);
				break;
			}
			default:
				{
				System.out.println("Invalid Case.");
				break;
				}
			}
			sc.nextLine();
			System.out.println("Do you want to continue?");
			choice=sc.next();
		}
	}
}