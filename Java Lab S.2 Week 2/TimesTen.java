import java.util.Scanner;


public class TimesTen
{
	public static void main(String[] args)
	{
		double myVar1 = timesTen(5.2);
		int myVar2 = square(4);

		System.out.println(myVar1);

		System.out.println(myVar2);

		System.out.println(getName());

	}

	public static double timesTen(double num)
	{
		return num*10;
	}

	public static int square(int num)
	{
		return num*num;
	}
	public static String getName()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = keyboard.nextLine();
		return name;
	}

}