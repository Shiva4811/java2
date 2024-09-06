import java.util.*;
class Bmi
{
	public static void main(String args[])
	{
		float w, h, bmi;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of Height in m and Weight in kg: ");
		h=sc.nextFloat();
		w=sc.nextFloat();
		bmi=w/(h*h);
		System.out.println("The BMI index is : "+bmi);
		if(bmi<18)
		{
			System.out.println("Underweight");
		}
		else if(bmi>18 && bmi<25)
		{
			System.out.println("Normal");
		}
		else if(bmi>25 && bmi<30)
		{
			System.out.println("Overweight");
		}
		else
		{
			System.out.println("Obesity");
		}

	}
}