//Method check with the reference variable and call with object in the class
interface Inter
{

}
class Tester2 implements Inter
{
	public void honk() //user defined method
	{
	System.out.println("Beep Beep");
	}
	public String toString() //from the object class
	{
	return "r u crazy";
	}
	public static void main(String args[])
	{
	Inter obj=new Tester2(); //Upcasting 
	//obj.honk();  //Compile time error
	String recieve=obj.toString(); //okk
	System.out.println(recieve);
	}
}