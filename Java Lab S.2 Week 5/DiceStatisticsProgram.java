import java.util.Scanner;

public class DiceStatisticsProgram
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		String input;
		System.out.print("How many side would you like for your die? (1-20): ");
		int sides = kb.nextInt();
		Die user = new Die(sides);

		System.out.print("How many times would you like to roll?");
		int numTimes = kb.nextInt();


		for(int i = 1; i <= numTimes; i++)
		{
			user.roll();
			System.out.println("Roll "+ i + ": " + user.getValue());
		}


		System.out.println("What is the number you want? : ");
		double hopeNum = kb.nextDouble();

		System.out.println(user.getMean(numTimes));

		System.out.println("The probability that your number or less appears is " + user.getHope(hopeNum));






 	// Pepper sauce
	}
}