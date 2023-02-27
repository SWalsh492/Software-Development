import java.util.Scanner;

public class JavaScanner5
{
	public static void main(String[] args)
	{
		int num1;
		double num2;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter integer number: ");
		num1 = keyboard.nextInt();
		System.out.println("Enter decimal point number: ");
		num2 = keyboard.nextInt();
		System.out.println("- - - - - - - - - - - - - ");
		System.out.println("First number entered was: " + num1);
		System.out.println("Second number entered was: " + num2);
		System.out.println("- - - - - - - - - - - - - ");
		System.out.println("Sum of numbers: "+ (num1+num2));
		System.out.println("- - - - - - - - - - - - - ");
		System.out.println("Average of numbers: " + ((num1 + num2)/2));





	}


}

