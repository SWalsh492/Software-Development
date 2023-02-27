// Shane Walsh, G00406694, 26/04/2022

import java.util.Scanner;

public class ShaneWalshQuestion4
{
	public static void main(String[] args)
	{
		// Create 10 chosen objects using class constructor
		Technology Dell = new Technology("Dell", "Optiplex", 'C', 599.99);
		Technology Apple = new Technology("Apple", "iPhone", 'P', 999.99);
		Technology Dell2 = new Technology("Dell", "Optiplex", 'C', 599.99);
		Technology Samsung = new Technology("Samsung", "S20", 'P', 299.99);
		Technology Samsung2 = new Technology("Samsung", "A10", 'P', 199.99);
		Technology Bose = new Technology("Bose", "ZA1", 'S', 299.99);
		Technology Nokia = new Technology("Nokia", "3310", 'P', 50.00);
		Technology HP = new Technology("HP", "Deskpro", 'C', 799.99);
		Technology Lenovo = new Technology("Lenovo", "ThinkPad", 'C', 799.99);
		Technology SanDisk = new Technology("SanDisk", "USB Pen Drive", 'O', 9.99);

		// Uses the toString method to verify correct creation of objects
		System.out.println(Dell);
		System.out.println(Apple);
		System.out.println(Dell2);
		System.out.println(Samsung);
		System.out.println(Samsung2);
		System.out.println(Bose);
		System.out.println(Nokia);
		System.out.println(HP);
		System.out.println(Lenovo);
		System.out.println(SanDisk);

		// Uses report and displayTotal methods to output number of items, array values and total sales
		Nokia.report();

		HP.displayTotal();
	}
}