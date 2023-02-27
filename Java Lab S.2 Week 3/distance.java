import java.util.Scanner;

public class distance
{
	public static void main(String[] args)
	{

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the vehicle's speed: ");
		double speed = keyboard.nextDouble();

		if(speed < 0)
		{
			System.out.println("Must be greater than 0");
			System.out.println("Enter the vehicle's speed: ");
			speed = keyboard.nextDouble();
		}

		System.out.println("Enter the number of hours the vehicle was in motion: ");
		int time = keyboard.nextInt();

		if(time < 0)
		{
			System.out.println("Must be greater than 0");
			System.out.println("Enter the number of hours the vehicle was in motion: ");
			time = keyboard.nextInt();
		}

		System.out.println("Hour		Distance Traveled");
		System.out.println("----------------------------------------");

		for(int i = 1; i <= time; i ++)
		{
			System.out.println(i + "		" + distance(speed, i));
		}

	}

	public static double distance(double speed, double time)
	{
		double distance = speed*time;
		return distance;

	}


}