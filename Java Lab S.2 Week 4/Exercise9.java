import java.util.Scanner;

class Exercise9
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		Payroll data = new Payroll();

		System.out.print("Enter the employee's name: ");
		String name = keyboard.nextLine();
		data.setName(name);

		System.out.print("Enter the employee's ID number: ");
		int idNumber = keyboard.nextInt();
		data.setIDNumber(idNumber);

		System.out.print("Enter the employee's hourly pay rate: ");
		double payRate = keyboard.nextDouble();
		data.setHourlyRate(payRate);

		System.out.print("Enter the number of hours worked by the employee: ");
		int hours = keyboard.nextInt();
		data.setHoursWorked(hours);

		System.out.println("\nEmployee Payroll Data \nName: " + data.getName());
		System.out.println("ID Number: " + data.getIDNumber());
		System.out.println("Hourly pay rate: " + data.getHourlyRate());
		System.out.println("Hours Worked: " + data.getHoursWorked());
		System.out.println("Gross pay: eur " + (payRate*hours));

	}
}