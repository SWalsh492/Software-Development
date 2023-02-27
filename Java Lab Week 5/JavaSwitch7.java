import java.util.Scanner;

public class JavaSwitch7
{
	public static void main(String[] args)
	{
		double wage;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Employee current weekly wage: ");
		wage = keyboard.nextDouble();

		char grade;
		System.out.println("Enter Employee grade (A, B or C): ");
		grade = keyboard.next().charAt(0);
		keyboard.close();
		switch(grade)
		{
			case 'a':
			case 'A':
				System.out.println("Grade A Employee: This weeks wage plus bonus is " + (wage+100));
				break;

			case 'b':
			case 'B':
				System.out.println("Grade B Employee: This weeks wage plus bonus is " + (wage+50));
				break;

			case 'c':
			case 'C':
				System.out.println("Grade C Employee: This weeks wage plus bonus is" + (wage+15));
				break;

			default:
				System.out.println("This weeks wage is " + wage + ", there is no bonus.");



		}

	}
}