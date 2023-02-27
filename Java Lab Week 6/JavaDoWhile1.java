import java.util.Scanner;

public class JavaDoWhile1
{
	public static void main(String[] args)
	{
		double num1;
		char prompt = 'y';
		Scanner keyboard = new Scanner(System.in);

		do
		{
			System.out.println("Enter a number: ");
			num1 = keyboard.nextDouble();

			if(num1%2 == 0)
			{
				System.out.println("Number is even");
			}
			else{
				System.out.println("Number is odd");
				}

			System.out.println("Enter y to continue: ");
			prompt = keyboard.next().charAt(0);
		}while(prompt == 'y');
	}
}