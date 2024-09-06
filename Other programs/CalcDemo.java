import java.util.*;
class Math
{
	public int i;
	
	void A()
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for Additon, Press 2 for Subtraction.");
		i=sc.nextInt();
	}
}
class CalcDemo
{
	public static void main(String args[])
	{
	int a,b,c;
	Math obj=new Math();
	Scanner sc1=new Scanner(System.in);
	obj.A();
	
	while(true)
	{
	switch(obj.i)
	{
	case 1:
	
	System.out.println("Enter the first number: ");
	a=sc1.nextInt();
	System.out.println("Enter the second number: ");
	b=sc1.nextInt();
	c=a+b;
	System.out.println("The addition is : "+c);
	break;

	case 2:
	System.out.println("Enter the first number: ");
	a=sc1.nextInt();
	
	System.out.println("Enter the second number: ");
	b=sc1.nextInt();
	
	c=a-b;
	System.out.println("The Subtraction is : "+c);
	break;

	default:
	System.out.println("Invalid Number.");
	break;
	}
	System.out.println("Do you want to perform any other operation?");
	String d=sc1.next();
	if(d.equalsIgnoreCase("Yes"))
	{
		
	obj.A();
	}
	else
	{
		System.out.println("Invalid case.");
	}
}
	}
}

/*import java.util.*;

class Math {
    public int i;

    void A() {
        System.out.println("Press 1 for Addition, Press 2 for Subtraction.");
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
    }
}

class CalcDemo {
    public static void main(String args[]) {
        int a, b, c;
        Math obj = new Math();
        Scanner sc1 = new Scanner(System.in);

        while (true) {
            obj.A();

            switch (obj.i) {
                case 1:
                    System.out.println("Enter the first number: ");
                    a = sc1.nextInt();
                    System.out.println("Enter the second number: ");
                    b = sc1.nextInt();
                    c = a + b;
                    System.out.println("The addition is: " + c);
                    break;

                case 2:
                    System.out.println("Enter the first number: ");
                    a = sc1.nextInt();
                    System.out.println("Enter the second number: ");
                    b = sc1.nextInt();
                    c = a - b;
                    System.out.println("The subtraction is: " + c);
                    break;

                default:
                    System.out.println("Invalid Number.");
                    break;
            }

            System.out.println("Do you want to perform any other operation? (Yes/No)");
            String d = sc1.next();
            if (!d.equalsIgnoreCase("Yes")) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }
        }
        sc1.close();
    }
}*/
