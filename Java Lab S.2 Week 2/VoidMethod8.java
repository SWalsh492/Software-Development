public class VoidMethod8
{

	public static void main(String[] args)
	{
		checkNum(95);

		checkNum(1000);

		checkNum(4567);
	}

	public static void checkNum(int num)
	{
		if(num < 1000)
		{
			System.out.println("Number provided to the method is less than 1000!");
		}
		else if(num == 1000)
		{
			System.out.println("Number provided to the method is 1000!");
		}
		else
		{
			System.out.println("Number provided to the method is greater than 1000!");

		}

	}

}