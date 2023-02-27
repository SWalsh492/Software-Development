import java.util.Scanner;

public class PastExam
{
	public static void main(String[] args)
	{
		// Title and calculation options
		System.out.println("---------JAVA MULTI-CONVERTER-------");
		System.out.println("\nMENU");
		System.out.println("\nChoosefrom one of the following menu options:");
		System.out.println("\n1. Convert Distance: Miles to Kilometers");
		System.out.println("2. Convert Distance: Kilometers to Miles");
		System.out.println("3. Convert Temperature: Celsius to Farenheit");
		System.out.println("4. Convert Temperature: Farenheit to Celsius");
		System.out.println("5. Convert Length: Inches to Millimeters");
		System.out.println("6. Convert Length: Millimeters to Inches");
		System.out.println("7. Convert Finance: Euros to Sterling");
		System.out.println("8. Convert Finance: Sterling to Euros");

		// Variable declarations
		int option;
		String carryOn = "yes";
		int count = 0;
		String name;
		String calc1 = " ";
		String calc2 = " ";
		String calc3 = " ";
		double kilometers;
		double miles;
		float celsius;
		float farenheit;
		short inches;
		short millimeters;
		double euro;
		double sterling;


		do{
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter option (1 to 8): ");
			option = keyboard.nextInt();

			switch(option)
			{
				case 1:
					++count;
					System.out.println("\t1. Convert Miles to Kilometers");
					System.out.println("\t\tEnter miles: ");
					miles = keyboard.nextDouble();
					kilometers = miles*1.609344;
					System.out.println(miles + " miles is " + kilometers + " in kilometers");
					if(calc1 == " " && calc2 == " " && calc3 == " ")
					{
						calc1 = (miles + " miles is " + kilometers + " in kilometers");
					}
					else if(calc1 != " " && calc2 == " " && calc3 == " ")
					{
						calc2 = (miles + " miles is " + kilometers + " in kilometers");
					}
					else if(calc1 != " " && calc2 != " " && calc3 == " ")
					{
						calc3 = (miles + " miles is " + kilometers + " in kilometers");
					}
					break;

				case 2:
					++count;
					System.out.println("\t1. Convert Kilometers to miles");
					System.out.println("\t\tEnter kilometers: ");
					kilometers = keyboard.nextDouble();
					miles = kilometers/1.609344;
					System.out.println(kilometers + " kilometers is " + miles + " in miles");
					calc2 = (kilometers + " kilometers is " + miles + " in miles");
					if(calc1 == " " && calc2 == " " && calc3 == " ")
					{
						calc1 = (kilometers + " kilometers is " + kilometers + " in miles");
					}
					else if(calc1 != " " && calc2 == " " && calc3 == " ")
					{
						calc2 = (kilometers + " kilometers is " + kilometers + " in miles");
					}
					else if(calc1 != " " && calc2 != " " && calc3 == " ")
					{
						calc3 = (kilometers + " kilometers is " + kilometers + " in miles");
					}
					break;

			}
			if(count == 3)
			{
				System.out.println("Calculations complete!");

				System.out.println("\nEnter your name: ");
				name = keyboard.nextLine();
				name = keyboard.nextLine();
				System.out.println("\tEND OF PROGRAM REACHED "+ name.toUpperCase() + "!");
				System.out.println(name + ", There were " + count + " calculations in total.");
				System.out.println(name + ", the calculations were: ");
				System.out.println(calc1);
				System.out.println(calc2);
				System.out.println(calc3);
				break;


			}
			else
			{
				System.out.println("Continue? Enter Yes: ");
				carryOn = keyboard.nextLine();
				carryOn = keyboard.nextLine();

			}

		}while(carryOn.equalsIgnoreCase("yes"));

		System.out.println("Calculations complete!");

		Scanner keyboard = new Scanner(System.in);
		System.out.println("\nEnter your name: ");
		name = keyboard.nextLine();
		System.out.println("\tEND OF PROGRAM REACHED "+ name.toUpperCase() + "!");
		System.out.println(name + ", There were " + count + " calculations in total.");
		System.out.println(name + ", the calculations were: ");
		System.out.println(calc1);
		System.out.println(calc2);
		System.out.println(calc3);






	}
}