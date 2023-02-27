import java.util.Scanner;

public class reunion1
{
	public static void main(String[] args)
	{
		System.out.println("This program will help you select a restaurant.");

		String veg;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Is anyone in your party a vegetarian? (Enter yes or no): ");
		veg = keyboard.nextLine();

		String vegan;
		System.out.println("Is anyone in your party a vegan? (Enter yes or no): ");
		vegan = keyboard.nextLine();

		String gluten;
		System.out.println("Is anyone in your party gluten free? (Enter yes or no): ");
		gluten = keyboard.nextLine();

		System.out.println("Here are your restaurant cjoices: ");

		if(veg.equalsIgnoreCase("no") && vegan.equalsIgnoreCase("no") && gluten.equalsIgnoreCase("no"));
		{
			System.out.println("Joe's Gourmet Burgers");
		}
		if(veg.equalsIgnoreCase("yes") && vegan.equalsIgnoreCase("no") && gluten.equalsIgnoreCase("yes"));
		{
			System.out.println("Main Street Pizza");
		}
		if(veg.equalsIgnoreCase("yes") && vegan.equalsIgnoreCase("yes") && gluten.equalsIgnoreCase("yes"));
		{
			System.out.println("Corner Cafe");
		}
		if(veg.equalsIgnoreCase("yes") && vegan.equalsIgnoreCase("no") && gluten.equalsIgnoreCase("no"));
		{
			System.out.println("Mama's Fine Italian");
		}
		if(veg.equalsIgnoreCase("yes") && vegan.equalsIgnoreCase("yes") && gluten.equalsIgnoreCase("yes"));
		{
			System.out.println("The Chef's Kitchen");
		}



	}
}