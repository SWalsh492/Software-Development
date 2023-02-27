public class VoidMethod7
{

	public static void main(String[] args)
	{
		addNumbers(5, 4);
	}

	public static void addNumbers(double num1, double num2)
	{
		System.out.printf("Number 1 is %.1f \n", num1);
		System.out.printf("Number 2 is %.1f \n", num2);
		System.out.printf("Addition is: %.1f \n", (num1+num2));

	}

}