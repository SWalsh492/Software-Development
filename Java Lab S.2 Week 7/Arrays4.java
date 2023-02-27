public class Arrays4
{
	public static void main(String[] args)
	{
		int[] numbs = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

		int sum1 = 0;
		for(int i = 0; i < 10; i++)
		{
			sum1 += numbs[i];
		}
		System.out.println("The sum of all 10 values is: " + sum1);

		int sum2 = 0;
		for(int i = 0; i < 5; i++)
		{
			sum2 += numbs[i];
		}
		System.out.println("The sum of the first 5 values is: " + sum2);

		int sum3 = 0;
		for(int i = 5; i < 10; i++)
		{
			sum3 += numbs[i];
		}
		System.out.println("The sum of the last 5 values is: " + sum3);


	}
}