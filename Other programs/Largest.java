import java.util.Scanner;
class Findlarger
{
public static void main(String args[])
{
int num1,num2;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number:-");
num1=sc.nextInt();
System.out.println("Enter the second number:-");
num2=sc.nextInt();
if(num1>num2)
{
System.out.println("Largest of "+num1+"And "+num2+"is "+num1);
}
else
{
System.out.println("Largest of "+num1+" and "+num2+"is " +num2);
}
}
}