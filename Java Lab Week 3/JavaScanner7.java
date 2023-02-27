import java.util.Scanner;

public class JavaScanner7
{
	public static void main(String[] args)
	{
		double num1;
		double num2;
		Scanner keyboard = new Scanner(System.in);;
		System.out.println("Enter first number: ");
		num1 = keyboard.nextDouble();
		System.out.println("Enter second number: ");
		num2  = keyboard.nextDouble();
		System.out.println("_____________________________________");
		System.out.println(num1 + " + " + num2 + "is: " + (num1+num2));
		System.out.println(num1 +" - " + num2 + "is: " + (num1-num2));
		System.out.println(num1 +" / " + num2 + "is: " + (num1/num2));
		System.out.println(num1 +" * " + num2 + "is: " + ((num1*num2)));
		System.out.println("_____________________________________");






	}


}
