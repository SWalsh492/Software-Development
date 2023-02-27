import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
import java.io.*;



public class ShaneWalshTrialQuestion4
{
	public static void main(String[] args) throws IOException
	{
		String firstName;
		String surname;
		int numOfNights;
		double cost;
		String invoice;
		int num1;
		int choice;
		int choice2;
		double extras = 0;
		double total = 0;
		String history = "";

		int carryOn = 0;
		int count = 0;

		JOptionPane.showMessageDialog(null, "Welcome to the \n--------------- \nJAVA \nHOTEL \n--------------- \n\nGUEST CHECKOUT \nBILLING SYSTEM \n---------------");

		do
		{
			count++;
			firstName = JOptionPane.showInputDialog(null, "Enter First Name: ");
			surname = JOptionPane.showInputDialog(null, "Enter surname: ");

			String input = JOptionPane.showInputDialog(null, "How many nights was your stay? ");
			numOfNights = Integer.parseInt(input);

			switch(numOfNights)
			{
				case 1:
					cost = 100;
					break;

				case 2:
					cost = 180;
					break;

				case 3:
					cost = 240;
					break;

				default:
					cost = 70;
					break;
			}

			Random randomNumber = new Random();
			num1 = randomNumber.nextInt(501)+5000;
			invoice = "JH-"+num1;

			JOptionPane.showMessageDialog(null, "--------------- \nJAVA \nHOTEL \n--------------- \nBooking System \n\nNAME: " + firstName + " " + surname + "\nNIGHTS: "+ numOfNights + "\nTOTAL COST: " + cost + "\nINVOICE NUMBER: " + invoice);

			JOptionPane.showMessageDialog(null, "Creating invoice for this stay.. \n\nFILENAME: " + firstName+surname + ".txt");

			FileWriter fwriter = new FileWriter("invoices/" +firstName+surname + ".txt", true);
			PrintWriter outputFile = new PrintWriter(fwriter);

			outputFile.println("---------- THE JAVA HOTEL ----------");
			outputFile.println("---------- CUSTOMER INVOICE ----------");

			outputFile.println("\nINVOICE NUMBER: " + invoice);
			outputFile.println("NAME: " + firstName + " " + surname);
			outputFile.println("STAY DURATION: " + numOfNights + " nights");
			outputFile.println("\nCOST: EUR " + cost);


			choice = JOptionPane.showConfirmDialog(null, "ADD EXTRAS? \n(Drinks, food, room service, mini-bar)");

			if(choice == 0)
			{
				input = JOptionPane.showInputDialog(null, "Enter extra charges for room: ");
				extras = Integer.parseInt(input);
				outputFile.println("\n---------- EXTRAS ---------- \nEXTRAS: \nEXTRAS \t" + extras);
				outputFile.println("TOTAL INC> EXTRAS: \t" + (cost+extras + "\n--------------------"));
			}

			outputFile.close();

			history = history + "Invoice number " + invoice + " - Customer Name: " + firstName + " " + surname + " - TOTAL Charge: " + (cost+extras) + "\n";
			total = (total+cost+extras);


			choice2 = JOptionPane.showConfirmDialog(null, "INVOICE CREATED FOR " + firstName + " " + surname + ". \nWOULD YOU LIKE TO GENERATE ANOTHER INVOICE?");

			if(choice2 == 1 || choice2 == 2)
			{
				carryOn++;
			}

		}while(carryOn == 0 && count <=5);


		JOptionPane.showMessageDialog(null, "PROGRAM COMPLETE! LOGFILE GENERATED");

		FileWriter fwriter = new FileWriter("invoices/LOGFILE.txt", true);
		PrintWriter outputFile = new PrintWriter(fwriter);

		outputFile.println("LOG FILE RECORD OF INVOICES PROCESSED:");
		outputFile.println(history);
		outputFile.println("TOTAL OF ALL STAYS: \t " + total);

		outputFile.close();


		System.out.println("LOG FILE RECORD OF INVOICES PROCESSED:");
		System.out.println(history);
		System.out.println("TOTAL OF ALL STAYS: \t " + total);





	}
}