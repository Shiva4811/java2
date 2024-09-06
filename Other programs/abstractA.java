 abstract class A
{
abstract void M();
}
class B extends A
{
void M()
{
System.out.println("I am in child class");
}
public static void main(String args[])
{
B obj=new B();
}
}