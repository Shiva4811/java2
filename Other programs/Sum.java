import java.util.*;
class SiByReceivingInput
{
public static void main(String args[])
{
float p,r,si;
int n;
System.out.println("Enter the values of p,n,r");
Scanner sc= new Scanner(System.in);
p=sc.nextFloat();
n=sc.nextInt();
r=sc.nextFloat();
si=(p*n*r)/100;
System.out.println("Simple Interest: Rs" +si);
}
}