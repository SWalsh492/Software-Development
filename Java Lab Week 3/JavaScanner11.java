import java.util.Scanner;

public class JavaScanner11
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String firstname;
		System.out.print("Enter first name: ");
		firstname = keyboard.nextLine();
		String surname;
		System.out.print("Enter surname: ");
		surname = keyboard.nextLine();
		int employee;
		System.out.print("Enter employee ID: ");
		employee = keyboard.nextInt();
		double salary;
		System.out.print("Entrer Salary: ");
		salary = keyboard.nextDouble();
		Double prsi = ((salary/100)*35);
		System.out.println("\n");
		System.out.println("|-----------------------------|");
		System.out.println("| PAYSLIP");
		System.out.println("|-----------------------------|");
		System.out.println("| EMPLOYEE: " + (firstname + " " + surname));
		System.out.println("| ID: " + employee);
		System.out.println("| \n");
		System.out.println("| SALARY: " + salary);
		System.out.println("| PRSI: " + prsi);
		System.out.println("| ANNUAL TAKE HOME: " + (salary - prsi));
		System.out.println("| MONTHLY TAKE HOME: " + ((salary - prsi)/12));
		System.out.println("|-----------------------------|");












	}


}