import java.util.Scanner;

public class JavaWhile2
{
	public static void main(String[] args)
	{
		int num1;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter number of times you want hello to be outputted: ");
		num1 = keyboard.nextInt();

		String phrase;
		System.out.println("What Phrase would you like: ");
		phrase = keyboard.nextLine();
		phrase = keyboard.nextLine();

		while (num1>0)
		{
		System.out.println(phrase);
		num1--;
		}
	}
}