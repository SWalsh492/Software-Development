import java.util.Scanner;

public class Arrays2D7
{
	public static void main(String[] args)
	{
		String[][] employees = new String[3][3];

		Scanner kb = new Scanner(System.in);



		System.out.println("Enter first name for person 1: ");
		employees[0][0] = kb.nextLine();

		System.out.println("Enter surname for person 1: ");
		employees[0][1] = kb.nextLine();

		System.out.println("Enter phone number of person 1: ");
		employees[0][2] = kb.nextLine();



		System.out.println("Enter first name for person 2: ");
		employees[1][0] = kb.nextLine();

		System.out.println("Enter surname for person 2: ");
		employees[1][1] = kb.nextLine();

		System.out.println("Enter phone number of person 2: ");
		employees[1][2] = kb.nextLine();


		System.out.println("Enter first name for person 3: ");
		employees[2][0] = kb.nextLine();

		System.out.println("Enter surname for person 3: ");
		employees[2][1] = kb.nextLine();

		System.out.println("Enter phone number of person 3: ");
		employees[2][2] = kb.nextLine();


		System.out.println("Person 1: " + employees[0][0] + " " + employees[0][1] + " - Phone number is: " + employees[0][2]);
		System.out.println("Person 2: " + employees[1][0] + " " + employees[1][1] + " - Phone number is: " + employees[1][2]);
		System.out.println("Person 3: " + employees[2][0] + " " + employees[2][1] + " - Phone number is: " + employees[2][2]);
	}
}