import java.util.Scanner;

public class JavaScanner10
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String name;
		System.out.print("Please enter your name: ");
		name = keyboard.nextLine();
		int birth;
		System.out.print("Please enter your year of birth: ");
		birth = keyboard.nextInt();
		System.out.println("Greetings, " + name + "! ");
		System.out.println("You were born in " + birth + " and therefore you are " + (2021 - birth) + " years old.");






	}


}