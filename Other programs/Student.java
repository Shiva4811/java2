class Student 
{
int roll;
String name;
Address address; //has a relation

Student(int roll,String name,Address address)
{
this.roll=roll;
this.name=name;
this.address=address;
}
public void display()
{
	System.out.println("Roll is "+roll);
	System.out.println("Name is "+name);
	System.out.println("Address is "+address.city);
}
public static void main(String args[])
{
	Address address=new Address("Agra","UP","India");
	Student stObj=new Student(101,"Dev Singh",address);
	stObj.display();
}
}