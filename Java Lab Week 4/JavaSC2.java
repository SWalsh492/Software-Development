import java.util.Scanner;

public class JavaSC2
{
	public static void main(String[] args)
	{
		String username;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter username: ");
		username = keyboard.nextLine();

		String password;
		System.out.println("Enter password: ");
		password = keyboard.nextLine();


		if(username.equalsIgnoreCase("Bob") && password.equalsIgnoreCase("pass"))
		{
			System.out.println("_______________________________________________________");
			System.out.println("	S Y S T E M		A C C E S S		G R A N T E D ");
			System.out.println("_____________________________________________________");

		}
		else
		{
			System.out.println("_______________________________________________________");
			System.out.println("Username or password incorrect.");
			System.out.println("ACCESS DENIED");
			System.out.println("_____________________________________________________");

		}
	}
}