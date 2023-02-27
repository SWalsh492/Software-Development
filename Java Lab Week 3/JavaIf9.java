import java.util.Scanner;

public class JavaIf9
{
	public static void main(String[] args)
	{
		int num;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter number: ");
		num = keyboard.nextInt();


		if(num%2==0)
		{
			System.out.println("The number entered is even");

		}
		if(num%2==1)
		{
			System.out.println("The number entered is odd");

		}



	}
}