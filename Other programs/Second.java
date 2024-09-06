import java.util.*;
class Second
{
public static void main(String args[])
{
float a,b,c,d,e;
Scanner obj=new Scanner(System.in);
System.out.println("Enter the marks of physics:");
a=obj.nextFloat();
System.out.println("Enter the marks of Chemistry:");
b=obj.nextFloat();
System.out.println("Enter the marks of Maths:");
c=obj.nextFloat();
System.out.println("Enter the marks of English:");
d=obj.nextFloat();
System.out.println("Enter the marks of physical eduaction:");
e=obj.nextFloat();
float z=(a+b+c+d+e);
System.out.println("The total marks of the student is:"+z);
float percent= z/5;
System.out.println("The percent is :"+percent);
}
}