import java.util.Scanner;

public class VoidMethod12
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double num1 = keyboard.nextDouble();

		System.out.print("Enter second number: ");
		double num2 = keyboard.nextDouble();

		System.out.print("Enter third number: ");
		double num3 = keyboard.nextDouble();

		average(num1, num2, num3);

	}

	public static void average(double num1, double num2, double num3)
	{
		System.out.printf("Sum of all 3 numbers is %.2f \nTHE AVERAGE IS: %.2f \n-----------------------------------", (num1+num2+num3), (num1+num2+num3)/3);
	}
}