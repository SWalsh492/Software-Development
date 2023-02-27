// Shane Walsh, G00406694, 14/12/21

import java.util.Random;

public class ShaneWalshQuestion3
{
	public static void main(String[] args)
	{
		// Declaration of my variables
		String cardValue = " ";
		String cardSuit = " ";
		int randNum;

		// Generates random integer for card value, switch statement changes 1, 11, 12 or 13 to specificed card title
		Random randomNumber = new Random();
		randNum = randomNumber.nextInt(13)+1;

		switch(randNum)
		{
			case 1:
				cardValue = "Ace";
				break;

			case 11:
				cardValue = "Jack";
				break;

			case 12:
				cardValue = "Queen";
				break;

			case 13:
				cardValue = "King";
				break;

			default:
				cardValue = (""+randNum);
				break;
		}

		// Generates random integer fo card suit, switch statement changes all numbers generated to corresponding suit type
		randNum = randomNumber.nextInt(4)+1;

		switch(randNum)
		{
			case 1:
				cardSuit = "Hearts";
				break;

			case 2:
				cardSuit = "Diamonds";
				break;

			case 3:
				cardSuit = "Clubs";
				break;

			case 4:
				cardSuit = "Spades";
				break;
		}

		// Details program and outputs users card
		System.out.printf("This program will deal a card from a deck of 52 cards.\nYour card is the %s of %s \n", cardValue, cardSuit);
	}
}