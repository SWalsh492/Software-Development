/*
Name: Shane Walsh,
Student ID: G00406694,
Date: 01/03/22
*/

import java.util.Scanner;

public class ShaneWalshQuestion4
{
	public static void main(String[] args)
	{
		// Creates 4 objects of the Clothes class using different constructors
		Clothes c1 = new Clothes("Trousers");
		Clothes c2 = new Clothes("Shirt", "Calvin Klein", 34.99f, true);
		Clothes c3 = new Clothes(32.99f, false);
		Clothes c4 = new Clothes();

		// Creates 5th object using the 4-argument constructor but with user input
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter details for object 5");
		System.out.print("Enter garment type: ");
		String garment = keyboard.nextLine();

		System.out.print("Enter brand: ");
		String brand = keyboard.nextLine();

		System.out.print("Enter item price: ");
		float price = keyboard.nextFloat();

		System.out.print("Is item available? Y or N: ");
		char stock = keyboard.next().charAt(0);

		// Converts char to boolean
		boolean available = false;
		switch(stock)
		{
			case 'Y':
			case 'y':
				available = true;
				break;

			case 'N':
			case 'n':
				available = false;
				break;
		}

		// Outputs the objects using getters
		Clothes c5 = new Clothes(garment, brand, price, available);

		System.out.println("\nObject 1 \nGARMENT: " + c1.getGarment() + "\nBRAND: " + c1.getBrand() + "\nPRICE: " + c1.getPrice() + "\nStock: " + c1.getStock() + "\n");

		System.out.println("Object 2 \nGARMENT: " + c2.getGarment() + "\nBRAND: " + c2.getBrand() + "\nPRICE: " + c2.getPrice() + "\nStock: " + c2.getStock() + "\n");

		System.out.println("Object 3 \nGARMENT: " + c3.getGarment() + "\nBRAND: " + c3.getBrand() + "\nPRICE: " + c3.getPrice() + "\nStock: " + c3.getStock() + "\n");

		System.out.println("Object 4 \nGARMENT: " + c4.getGarment() + "\nBRAND: " + c4.getBrand() + "\nPRICE: " + c4.getPrice() + "\nStock: " + c4.getStock() + "\n");

		System.out.println("Object 5 \nGARMENT: " + c5.getGarment() + "\nBRAND: " + c5.getBrand() + "\nPRICE: " + c5.getPrice() + "\nStock: " + c5.getStock() + "\n");

	}

}