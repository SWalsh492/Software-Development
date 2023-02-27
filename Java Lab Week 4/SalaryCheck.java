import java.util.Scanner;

public class SalaryCheck
{
	public static void main(String[] args)
	{
		double salary;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the current salary: ");
		salary = keyboard.nextDouble();

		String rating;
		System.out.println("Enter the performance rating (Excellent, good, or poor): ");
		rating = keyboard.nextLine();
		rating = keyboard.nextLine();


		if(rating.equalsIgnoreCase("Excellent"))
		{
			System.out.println("Current salary: " + salary);
			System.out.println("Amount of your raise: " + (salary/100)*6);
			System.out.println("Your new salary: " + (salary + (salary/100*6)));
		}
		else if(rating.equalsIgnoreCase("Good"))
		{
			System.out.println("Current salary: " + salary);
			System.out.println("Amount of your raise: " + (salary/100)*4);
			System.out.println("Your new salary: " + (salary + (salary/100*4)));
		}
		else if(rating.equalsIgnoreCase("Poor"))
		{
			System.out.println("Current salary: " + salary);
			System.out.println("Amount of your raise: " + (salary/100)*1);
			System.out.println("Your new salary: " + (salary + (salary/100*1)));
		}
		else
		{
			System.out.println("Input is out of range");
		}

	}
}