import java.util.Scanner;

public class JavaConvertKms
{
	public static void main(String[] args)
	{
		String name;
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter Employee name: ");
		name = kb.nextLine();

		double wage = 20076.35;
		System.out.printf("Current wage is EUR %,f", wage);

		double perc;
		System.out.println("\nEnter percentage increase:");
		perc = kb.nextDouble();
		kb.close();
		
		System.out.printf("Percentage wage increase is: %.2f", perc);
		System.out.printf("\nWage increase in value is: EUR %,.2f", (wage/100)*perc);
		System.out.printf("\n%S's new wage is: EUR %,.2f", name, wage+((wage/100)*perc));





	}
}