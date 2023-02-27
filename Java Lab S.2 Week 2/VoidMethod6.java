public class VoidMethod6
{

	public static void main(String[] args)
	{
		printTable(23);
	}

	public static void printTable(int num)
	{
		for(int i = 1; i <= 10; i++)
		{
			System.out.printf("%d times %d is equal to %d \n", num, i, (num*i));

		}

	}

}