import java.util.Scanner;

public class JavaSwitch4
{
	public static void main(String[] args)
	{
		char fruit;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter character: ");
		fruit = keyboard.next().charAt(0);
		keyboard.close();
		
		switch(fruit)
		{
			case 'a':
			case 'A':
				System.out.println("Apple");
				break;

			case 'b':
			case 'B':
				System.out.println("Banana");
				break;

			case 'c':
			case 'C':
				System.out.println("Coconut");
				break;

			default:
				System.out.println("Value entered is not valid!");



		}

	}
}