class Parent
{
	int var=10;
}
class Child6 extends Parent
{
	int var=150;
	public static void main(String args[])
	{
	Parent obj=new Child6();
	System.out.println(obj.var);
}
}