import java.util.Scanner;

public class HotelBooking
{
	public static void main(String[] args)
	{
		System.out.println("HOTEL ROOM BOOKING");
		System.out.println("--------------------");

		double price = 50;

		int nights;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter stay duration (1 to 7 nights): ");
		nights = keyboard.nextInt();

		String coupon;
		System.out.println("Valid coupon? (y or n): ");
		coupon = keyboard.nextLine();
		coupon = keyboard.nextLine();



		if(coupon.equalsIgnoreCase("y"))
		{
			double rate;
			System.out.println("Enter Discount rate: ");
			rate = keyboard.nextInt();
			double newPrice = (price/100)*rate;
			System.out.println("Cost for nights @ " + newPrice + " per night is " + newPrice*nights + " euros.");
		}
		else if(coupon.equalsIgnoreCase("n"))
		{
			System.out.println("Cost for nights @ 50.0 per night is " + price + " euros.");

		}




	}
}