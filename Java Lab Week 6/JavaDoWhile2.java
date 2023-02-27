import java.util.Scanner;

public class JavaDoWhile2
{
	public static void main(String[] args)
	{
		String password = "password";
		Scanner keyboard = new Scanner(System.in);

		do
		{
			System.out.println("Enter password: ");
			password = keyboard.nextLine();
		}while(!password.equals("mypass"));


		if(password.equalsIgnoreCase("mypass"))
		{
			System.out.println("Access granted!");
		}
		else
		{
			System.out.println("Access denied!");
		}
	}
}