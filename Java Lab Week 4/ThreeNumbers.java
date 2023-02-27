import java.util.Scanner;

public class ThreeNumbers
{
	public static void main(String[] args)
	{
		int num1;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		num1 = keyboard.nextInt();

		int num2;
		System.out.println("Enter the 2nd number: ");
		num2 = keyboard.nextInt();

		int num3;
		System.out.println("Enter the 3rd number: ");
		num3 = keyboard.nextInt();


		if(num1 > num2 && num1 > num3)
		{
			System.out.println("Biggest number is: " + num1);

		}
		else if(num2 > num1 && num2 > num3)
		{
			System.out.println("Biggest number is: " + num2);
		}

		else
		{
			System.out.println("Biggest number is: " + num3);

		}
	}
}