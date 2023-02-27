import java.util.Scanner;

public class SampleEx3_Q4
{
	public static void main(String[] args)
	{
		Customer c1 = new Customer("Jane");
		Customer c2 = new Customer("Charlie", "Smith");
		Customer c3 = new Customer();


		//Declare scanner for input
		Scanner keyboard = new Scanner(System.in);
		String firstname, surname;
		int age;

		System.out.print("Enter customer firstname: ");
		firstname = keyboard.nextLine();
		System.out.print("Enter customer surname: ");
		surname = keyboard.nextLine();
		System.out.print("Enter customer age: ");
		age = keyboard.nextInt();

		Customer c4 = new Customer(firstname, surname, age);

		System.out.println(c1.getFirstname());
		System.out.println(c1.getSurname());
		System.out.println(c1.getAge());

		System.out.println("\n\n");

		System.out.println(c2.getFirstname());
		System.out.println(c2.getSurname());
		System.out.println(c2.getAge());

		System.out.println("\n\n");

		System.out.println(c3.getFirstname());
		System.out.println(c3.getSurname());
		System.out.println(c3.getAge());

		System.out.println("\n\n");

		System.out.println(c4.getFirstname());
		System.out.println(c4.getSurname());
		System.out.println(c4.getAge());
	}

}