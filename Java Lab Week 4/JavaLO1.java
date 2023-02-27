import java.util.Scanner;

public class JavaLO1
{
	public static void main(String[] args)
	{
		int temp;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter temperature: ");
		temp = keyboard.nextInt();
		System.out.println("Current temperature is " + temp);

		if(temp > -10 && temp < 30)
		{
			System.out.println("Current temperature is within the normal range.");
		}
		else
		{
			System.out.println("Current temperature is outside the normal range.");
		}
	}
}

