import java.util.Scanner;

public class JavaLO3
{
	public static void main(String[] args)
	{
		int year = 1965;

		System.out.println("Checking if Year "+ year + " is outside range for 20th century");
		if(year < 1901 || year > 2000)
		{
			System.out.println("This year was not in the 20th century");

		}
		else
		{
			System.out.println("This year was in the 20th century");
		}
	}
}