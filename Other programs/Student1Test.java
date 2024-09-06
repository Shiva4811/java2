class Student1
{
	String name;
	int age;
}
class Student1Test
{
	public static void main(String args[])
	{
		//Student1 str; //Declaring 
		//str=new Student1(); //Creating an object of Student1
		//Or
		Student1 str=new Student1();
		str.name="Nothing is permanent in this world!";
		str.age=21;
		System.out.print(str.name+"\t"+str.age);	
	}

}