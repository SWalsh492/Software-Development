public class Construct10
{
	public static void main(String[] args)
	{
		int heads = 0;
		int tails = 0;

		Coin c1 = new Coin();

		System.out.println("The side initially facing up: " + c1.getSideUp());

		System.out.println("Now I will flip the coin 20 times");

		for(int i = 0; i < 20; i++)
		{
			c1.toss();
			System.out.println("Toss: " + c1.getSideUp());
			if(c1.getSideUp().equals("heads"))
			{
				heads++;
			}
			else
			{
				tails++;
			}
		}

		System.out.println("Heads: " + heads + "\nTails: " + tails);



	}
}