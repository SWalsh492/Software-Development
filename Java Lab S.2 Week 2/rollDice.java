import java.util.Random;

public class rollDice
{
	public static void main(String[] args)
	{
		System.out.println("Flip of Coin: " + coinflip());

		System.out.println("Roll the dice/Die: " + rollDice());

		System.out.println("Roll 2 Dice: " + roll2Dice());
	}

	public static String coinflip()
	{
		Random randomNumber = new Random();

		int coinFlip;

		String flipResult;

		coinFlip = randomNumber.nextInt(2)+1;

		if(coinFlip == 1)
		{
			flipResult ="Heads";
		}
		else
		{
			flipResult ="Tails";

		}

		return flipResult;
	}

	public static int rollDice()
	{
		Random randomNumber = new Random();

		int diceRoll;

		diceRoll = randomNumber.nextInt(6)+1;

		return diceRoll;
	}
	public static int roll2Dice()
	{
		Random randomNumber = new Random();

		int dice1 = randomNumber.nextInt(6)+1;

		int dice2 = randomNumber.nextInt(6)+1;

		return dice1+dice2;
	}

}