import javax.swing.JOptionPane;
import java.util.Random;


public class guessingGame
{
	public static void main(String[] args)
	{
		int compNum;
		int guess;

		compNum = computerRandom();

		guess = userGuess();

		checkGuess(guess, compNum);

	}

	public static int computerRandom()
	{
		Random randomNumber = new Random();
		int rng = randomNumber.nextInt(10)+1;
		return rng;
	}

	public static int userGuess()
	{
		String input;
		input = JOptionPane.showInputDialog("Guess a number between 1 and 10");
		int guess = Integer.parseInt(input);
		return guess;
	}

	public static int checkGuess(int guess, int compNum)
	{
		if(guess == compNum)
		{
			JOptionPane.showMessageDialog(null,"You guess correctly!");
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Sorry, better luck next time.");
		}
	}

}