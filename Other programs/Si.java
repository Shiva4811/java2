import java.util.*;
class SimpleInterest
{
public static void main(String args[])
{
float p,r,t,si;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of p,r,t:");
p=sc.nextFloat();
r=sc.nextFloat();
t=sc.nextFloat();
si=(p*r*t)/100;
System.out.println("The simple interest is: "+si);

}
}