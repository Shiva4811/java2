import java.util.*;
class Emp
{
	String name;
	int age;
	Pata pata;
	public Emp(String name,int age,Pata pata)
	{
		this.name=name;
		this.age=age;
		this.pata=pata;
	}
	void show()
	{
		System.out.println(name+"\t"+age);
		System.out.println(pata.country+"\t"+pata.city);
	}
}
class Has
{
	public static void main(String args[])
	{
		int age;
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name: ");
		name=sc.nextLine();
		System.out.println("Enter the age: ");
		age=sc.nextInt();
		Pata pata1=new Pata("India","Delhi");
		Emp e=new Emp(name,age,pata1);
		e.show();
	}
}

