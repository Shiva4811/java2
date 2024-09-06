import java.util.*;
class Profit
{
public static void main(String args[])
{
int cp,sp;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the cost price: ");
cp=sc.nextInt();
System.out.println("Enter the sp: ");
sp=sc.nextInt();
int d=sp-cp;

System.out.println("The profit loss of the person is: "+d);

if(d>0)
{
System.out.println("Profit"+d);
}
else
{
System.out.println("loss"+d);
}
}

}