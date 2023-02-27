import java.util.Scanner;

public class JavaScanner9
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String name;
		System.out.print("Please enter your name: ");
		name = keyboard.nextLine();
		int age;
		System.out.print("Please enter your age: ");
		age = keyboard.nextInt();
		System.out.println("Greetings, " + name + "! ");
		System.out.println("You are " + age + " years old.");






	}


}