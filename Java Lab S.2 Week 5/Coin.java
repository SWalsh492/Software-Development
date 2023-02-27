import java.util.Random;

public class Coin
{
	private String sideUp;

	Random randomNumber = new Random();

	public Coin()
	{
		int num = randomNumber.nextInt(2) + 1;

		if(num == 1)
		{
			sideUp = "heads";
		}
		else if(num == 2)
		{
			sideUp = "tails";
		}
	}

	public void toss()
	{
		int num = randomNumber.nextInt(2) + 1;
		if(num == 1)
		{
			sideUp = "heads";
		}
		else if(num == 2)
		{
			sideUp = "tails";
		}
	}

	public String getSideUp()
	{
		return sideUp;
	}




}