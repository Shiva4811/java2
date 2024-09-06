class Calculation
{
	int sum(int num1, int num2)
	{
	return (num1+num2);
	}
	double sum(float num2, float num1)
	{
	return (num1+num2);
	}
	public static void main(String args[])
	{
	Calculation obj=new Calculation();
	int result=obj.sum(10,20);
	}
}