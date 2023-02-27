import java.util.Scanner;


public class Construct8
{
	public static void main(String[] args)
	{
		Customer c1 = new Customer("Ada Lovelace");
		Customer c2 = new Customer("Margaret Hamilton", "123 Main Street, Dublin", 555465);
		Customer c3 = new Customer("James Gosling", 456789);
		Customer c4 = new Customer("Scott Free", "Shop Street, Galway");
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = kb.nextLine();
		System.out.println("Enter address: ");
		String address = kb.nextLine();
		System.out.println("Enter phone number: ");
		long phone = kb.nextLong();
		Customer c5 = new Customer(name,address,phone);


		System.out.println("Customer 1: \nname: " + c1.getName() + "\nAddress: " + c1.getAddress() + "\nPhone Number: " + c1.getPhone() + "\n");

		System.out.println("Customer 2: \nname: " + c2.getName() + "\nAddress: " + c2.getAddress() + "\nPhone Number: " + c2.getPhone() + "\n");

		System.out.println("Customer 3: \nname: " + c3.getName() + "\nAddress: " + c3.getAddress() + "\nPhone Number: " + c3.getPhone() + "\n");

		System.out.println("Customer 4: \nname: " + c4.getName() + "\nAddress: " + c4.getAddress() + "\nPhone Number: " + c4.getPhone() + "\n");

		System.out.println("Customer 5: \nname: " + c5.getName() + "\nAddress: " + c5.getAddress() + "\nPhone Number: " + c5.getPhone() + "\n");

	}
}