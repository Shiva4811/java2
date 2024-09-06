import java.util.*;
class Critical
{
    public static void main(String args[])
    {
    	float p,r,si;
    	int t;
    	Scanner sc=new Scanner(System.in);
    	for(int i=1; i<=3;i++)
    	{
    		System.out.println("Enter the values of p,r,t: ");
    		p=sc.nextFloat();
    		r=sc.nextFloat();
    		t=sc.nextInt();
    		si=p*r*t/100;
    		System.out.println("The calculate si is: "+si);
    	}
    }

}