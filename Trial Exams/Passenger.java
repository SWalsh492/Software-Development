public class Passenger
{
	private String firstName;
	private String lastName;
	private int birthYear;
	private boolean firstClass;
	private double price;
	private static int totalPass;
	private static int totalFirstClass;
	private static double totalPaid;

	Passenger(String firstName, String lastName, int birthYear, String ticketType, double price)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		if(ticketType.equalsIgnoreCase("First-class ticket"))
		{
			firstClass = true;
			totalFirstClass++;
		}
		else
		{
			firstClass = false;
		}
		this.price = price;
		totalPaid += price;
		totalPass++;

	}

	public String toString()
	{
		return "FirstName='" + firstName + "', lastName='" + lastName + "', year='" + birthYear + "', firstclass='" + firstClass + "', ticket='" + price + "'";
	}

	public void report()
	{
		System.out.printf("\n--- FLIGHT REPORT --- \nTotal Passengers: %d \nTotal FirstClass passengers: %d \nTotal Economy Class: %d \nTotal take : %.2f \n", totalPass, totalFirstClass, (totalPass-totalFirstClass), totalPaid);
	}



}