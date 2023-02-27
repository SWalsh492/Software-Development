import java.util.Scanner;
import java.util.Random;



public class oddEven
{
	public static void main(String[] args)
	{
		int odd = 0;
		int even = 0;
		for(int i = 1; i <=100; i++)
		{
			Random randomNumber = new Random();
			int randomNum = randomNumber.nextInt(100)+1;

			if(oddEven2(randomNum))
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("Out of 100 randomly generated numbers, " + even + " were even and " + odd + " were odd.");
	}

	public static boolean oddEven(int num1)
	{
		boolean status;

		if(num1 % 2 == 0)
		{
			status = true;
		}
		else
		{
			status = false;
		}

		return status;
	}

	public static boolean oddEven2(int num1)
	{
			return(num1 % 2 == 0);
	}

}