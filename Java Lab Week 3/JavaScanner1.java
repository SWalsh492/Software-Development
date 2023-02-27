import java.util.Scanner;

public class JavaScanner1
{
	public static void main(String[] args)
	{
		int number1;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a integer value: ");
		number1 = keyboard.nextInt();
		System.out.println("Number input was: " + number1);
	}
}