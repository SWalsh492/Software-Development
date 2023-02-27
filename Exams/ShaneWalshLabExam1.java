// Shane Walsh, G00406694, 09/11/21

import java.util.Scanner;
public class ShaneWalshLabExam1
{
	public static void main(String[] args)
	{
		// Declaration of my variables
		String username;
		byte menuOption;
		String guestName = "N/A";
		int guestNights = 0;
		char coupon;
		float costPerNight = 75.00f;
		char carryOn = 'y';
		String history = " ";
		int roomCount = 0;
		char shopItem;
		char guestOrNot;


		// Initial Output and Prompt user to input Username
		Scanner keyboard = new Scanner(System.in);
		System.out.println("\t\t====================================");
		System.out.println("\t\t\tTHE GALWAY GUESTHOUSE");
		System.out.println("\t\t====================================");
		System.out.println("Enter Username: ");
		username = keyboard.nextLine();

		// if statement displaying various greetings based on username
		if(username.equalsIgnoreCase("manager"))
		{
			System.out.println("WELCOME TO THE HOTEL BOOKING SYSTEM - You are the MANAGER");
		}
		else if(username.equalsIgnoreCase("owner"))
		{
			System.out.println("WELCOME TO THE HOTEL BOOKING SYSTEM - You are the OWNER");
		}
		else
		{
			System.out.println("WELCOME TO THE HOTEL BOOKING SYSTEM");
		}

		// do while loop for the bulk of our code, allows user to return to start of loop if they wish
		do
		{
			// Menu of options for user
			System.out.println("========= SYSTEM OPTIONS =========");
			System.out.println("1. Guest check-in");
			System.out.println("2. Reservations");
			System.out.println("3. Generate Bill");
			System.out.println("4. View all reservations");
			System.out.println("5. Show used Room Count");
			System.out.println("6. Purchase Items");
			System.out.println("==================================");

			System.out.println("Specify Item 1, 2, 3, 4, 5 or 6: ");
			menuOption = keyboard.nextByte();

			// switch statement based on users choice above
			switch(menuOption)
			{
				// Option 1 - Allows to check in a guest
				case 1:
					++roomCount;
					System.out.println("======== GUEST CHECK IN ========");
					System.out.println("ENTER GUEST NAME: ");
					guestName = keyboard.nextLine();
					guestName = keyboard.nextLine();
					System.out.println("NUMBER OF NIGHTS: ");
					guestNights = keyboard.nextInt();
					System.out.println("DISCOUNT COUPON (Y or N): ");
					coupon = keyboard.next().charAt(0);
					if(coupon == 'y' || coupon == 'Y')
					{
						System.out.printf("\nCost per night: %.2f", costPerNight);
						System.out.printf("\n%d nights @ %.2f euros per night is %.2f", guestNights, costPerNight, costPerNight*guestNights);
						System.out.println("\n15% percent discount applied with valid coupon:");
						System.out.printf("Total Cost: %.2f", (costPerNight*guestNights - (costPerNight*guestNights)/100*15));
						System.out.println("\n================================");
						history = (history + "\n" + guestName + " is staying for "+ guestNights + " - Cost: " + (costPerNight*guestNights - (costPerNight*guestNights)/100*15));
					}
					else if(coupon == 'n' || coupon == 'N')
					{
						System.out.printf("\nCost per night: %.2f", costPerNight);
						System.out.printf("\n%d nights @ %.2f euros per night is %.2f", guestNights, costPerNight, costPerNight*guestNights);
						System.out.printf("\nTotal Cost: %.2f", (costPerNight*guestNights));
						System.out.println("\n================================");
						history = (history + "\n" + guestName + " is staying for "+ guestNights + " - Cost: " + (costPerNight*guestNights));
					}
					break;

				// Option 2 - Allows user to check the last entered reservation
				case 2:
					System.out.println("======== RESERVATIONS ========");
					System.out.printf("NAME: %s", guestName);
					System.out.printf("\nNIGHTS: %d", guestNights);
					System.out.println("\n==============================");
					break;

				// Option 3 - Allow user to generate the bill for the last entered reservation
				case 3:
					System.out.println("======== VIEW BILL ========");
					System.out.printf("\nCUSTOMER NAME: %s", guestName);
					System.out.printf("\nBOOKED FOR: %d NIGHTS", guestNights);
					System.out.printf("\nTotal cost: %d nights @ 75 euros per night is %.2f", guestNights, costPerNight*guestNights);
					System.out.printf("\n15 percent discount has been applied, total cost is: %.2f", (costPerNight*guestNights -(costPerNight*guestNights)/100*15));
					System.out.println("\n============================");
					break;

				// Option 4 - Allows user to view all reservation history
				case 4:
					System.out.println("========= RESERVATIONS =========");
					System.out.printf(history);
					System.out.println("\n");
					System.out.println("================================");
					break;

				// Option 5 - Allows user to view total number of reservations
				case 5:
					System.out.println("======== ROOM COUNT ========");
					System.out.printf("\nNumber of rooms booked: %d", roomCount);
					System.out.println("\n============================");
					break;

				// Option 6 - Allows user to view items and prices in hotel shop
				case 6:
					System.out.println("====== PURCHASE ITEMS ======");
					System.out.println("Enter item for purchase: ");
					System.out.println("Enter P for Pepsi ");
					System.out.println("Enter C for Coke ");
					System.out.println("Enter N for no purchase ");
					System.out.println("Enter item for purchase: ");

					shopItem = keyboard.next().charAt(0);
					switch(shopItem)
					{
						case 'p':
						case 'P':
							System.out.println("Is this customer a hotel guest? Y or N: ");
							guestOrNot = keyboard.next().charAt(0);
							if(guestOrNot == 'y' || guestOrNot == 'Y')
							{
								System.out.println("Price for Pepsi for this customer is: 1:00 euro");
								System.out.println("============================");
							}
							else
							{
								System.out.println("Price for Pepsi for this customer is: 2:00 euro");
								System.out.println("============================");
							}
							break;

						case 'c':
						case 'C':
							System.out.println("Is this customer a hotel guest? Y or N: ");
							guestOrNot = keyboard.next().charAt(0);
							if(guestOrNot == 'y' || guestOrNot == 'Y')
							{
								System.out.println("Price for Coke for this customer is: 1:50 euro");
								System.out.println("=============================");
							}
							else
							{
								System.out.println("Price for Coke for this customer is: 2:25 euro");
								System.out.println("=============================");
							}
							break;

						case 'n':
						case 'N':
							System.out.println("No purchase is being made in the shop!");
							System.out.println("=============================");
							break;

					}
				}
				System.out.println("\nEnter Y to return to Menu, or type N to quit: ");
				carryOn = keyboard.next().charAt(0);

				}while(carryOn == 'y' || carryOn == 'Y');


	}
}

