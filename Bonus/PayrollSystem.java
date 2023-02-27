import java.util.Scanner;

public class PayrollSystem
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

		String employee;
		double raise;

		if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("123"))
		{
			System.out.println("System Access Granted...");
			System.out.println("Enter Employee name: ");
			employee = keyboard.nextLine();
			if(employee.equalsIgnoreCase("donald"))
			{
				System.out.println("Donald's current Salary @ 32000.0");
				System.out.println("Give raise of: ");
				raise = keyboard.nextDouble();
				System.out.println("Donald's new current Salary @ " + (32000.0+raise));
			}
			else if(employee.equalsIgnoreCase("hillary"))
			{
				System.out.println("Hillary's current Salary @ 25000.0");
				System.out.println("Give raise of: ");
				raise = keyboard.nextDouble();
				System.out.println("Hillary's new current Salary @ " + (25000.0+raise));
			}
			else if(employee.equalsIgnoreCase("joe"))
			{
				System.out.println("Hillary's current Salary @ 44000.0");
				System.out.println("Give raise of: ");
				raise = keyboard.nextDouble();
				System.out.println("Joe's new current Salary @ " + (44000.0+raise));
			}
		}
		else
		{
			System.out.println("You are not authorised to access this system!");
		}

	}
}