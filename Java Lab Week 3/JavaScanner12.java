import java.util.Scanner;

public class JavaScanner12
{
	public static void main(String[] args)
	{
		System.out.println("Population density calculator");
		Scanner keyboard = new Scanner(System.in);
		String countryName;
		System.out.print("Enter country name: ");
		countryName = keyboard.nextLine();
		int pop;
		System.out.print("Enter population: ");
		pop = keyboard.nextInt();
		int sqaurekm;
		System.out.print("Enter country area in square KM: ");
		sqaurekm = keyboard.nextInt();
		System.out.println(countryName + " has " + pop/sqaurekm + " people per square kilometer.");









	}


}