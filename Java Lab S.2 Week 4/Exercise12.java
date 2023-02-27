import java.util.Scanner;

class Exercise12
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		MonthDays calender = new MonthDays();

		System.out.print("Enter a month (1-12): ");
		calender.setMonth(keyboard.nextInt());

		System.out.print("Enter a year: ");
		calender.setYear(keyboard.nextInt());

		System.out.println(calender.getNumberOfDays() + " days");


	}
}