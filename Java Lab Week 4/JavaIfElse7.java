import java.util.Scanner;

public class JavaIfElse7
{
	public static void main(String[] args)
	{
		int perc;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter score number: ");
		perc = keyboard.nextInt();

		if(perc < 40)
		{
			System.out.println("Score of " + perc + "is less than 40. Grade is E");
		}
		else if(perc > 39 && perc < 50)
		{
			System.out.println("Score of " + perc + ". Grade is D");
		}
		else if(perc > 49 && perc < 60)
		{
			System.out.println("Score of " + perc + ". Grade is C");
		}
		else if(perc > 59 && perc < 70)
		{
			System.out.println("Score of " + perc + ". Grade is B");
		}
		else if(perc > 70)
		{
			System.out.println("Score of " + perc + ". Grade is A");
		}
		else
		{
			System.out.println("An Incorrect score was entered");
		}

	}
}