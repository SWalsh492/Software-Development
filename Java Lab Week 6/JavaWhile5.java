import java.util.Scanner;

public class JavaWhile5
{
	public static void main(String[] args)
	{
		int num1;
		Scanner keyboard = new Scanner(System.in);

		do
		{
			System.out.println("Enter a number between 0 and 50: ");
			num1 = keyboard.nextInt();
		}while(num1 >= 0 && num1 <= 50)

	}
}