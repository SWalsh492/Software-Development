import java.util.Scanner;
import java.io.*;

public class AprilTrial4
{
	public static void main(String[] args) throws IOException
	{
		Passenger Lewis = new Passenger("Lewis", "Hamilton", 1985, "first-class ticket", 200);
		Passenger Maria = new Passenger("Maria", "Sharapova", 1987, "First-class ticket", 200);
		Passenger George = new Passenger("George", "Foreman", 1949, "Economy", 125);
		Passenger Steffi = new Passenger("Steffi", "Graff", 1969, "economy", 125);
		Passenger David = new Passenger("David", "Beckham", 1975, "first-class ticket", 200);

		System.out.println(Lewis);
		System.out.println(Maria);
		System.out.println(George);
		System.out.println(Steffi);
		System.out.println(David);

		Lewis.report();
	}
}