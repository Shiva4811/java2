import java.util.*;
class Marks
{
public static void main(String args[])
{
float a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the marks of Maths:");
a=sc.nextFloat();
System.out.println("Enter the marks of Chemistry:");
b=sc.nextFloat();
System.out.println("Enter the marks of Physics:");
c=sc.nextFloat();
float d=(a+b+c)/3;
System.out.println("The Average marks of Student is: "+d);
if(d>70)
{
System.out.println("A grade");
}
if(d>40)
{
System.out.println("B grade");
}
else
{
System.out.println("Fail");
}

}
}