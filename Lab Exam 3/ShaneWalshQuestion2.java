/*
Name: Shane Walsh,
Student ID: G00406694,
Date: 01/03/22
*/

public class ShaneWalshQuestion2
{
    public static void main(String[] args)
    {
		// Calls weekly method
        weekly("Alice", "Smith", 35000);
        weekly("Bob","Jones",20000);
        weekly("Charlie","Smith",28000);
    }

	// Method created with weekly wage and calculated tax band
    public static void weekly(String firstname, String surname, double wage)
    {
		System.out.printf("The weekly wage of %s %s is %.2f \n", firstname, surname, wage / 52);

		if(wage < 25000)
		{
			System.out.printf("%s is in tax band C \n\n", firstname);
		}
		else if(wage >= 25000 && wage <= 30000)
		{
			System.out.printf("%s is in tax band B \n\n", firstname);
		}
		else
		{
			System.out.printf("%s is in tax band A \n\n", firstname);
		}
    }
}