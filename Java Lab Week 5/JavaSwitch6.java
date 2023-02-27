import java.util.Scanner;

public class JavaSwitch6
{
	public static void main(String[] args)
	{
		String username;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a username: ");
		username = keyboard.nextLine();
		keyboard.close();
		switch(username)
		{
			case "Grace":
			case "Larry":
			case "Bob":
				System.out.println("welcome " + username + " - Admin level access granted!");
				break;


			default:
				System.out.println("Access is denied!");



		}

	}
}