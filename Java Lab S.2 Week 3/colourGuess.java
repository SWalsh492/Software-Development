import javax.swing.JOptionPane;
import java.util.Random;

public class colourGuess
{
	public static void main(String[] args)
	{
		String colour = " ";
		String guess = " ";
		int points = 0;

		for(int i = 1; i <=5; i++)
		{
			colour = computerChoice();
			guess = userChoice();
			if(guess.equals(colour))
			{
				points++;
			}
			JOptionPane.showMessageDialog(null,colour);
		}
		JOptionPane.showMessageDialog(null,"Number of correct guesses: " + points);
	}

	public static String computerChoice()
	{
		Random randomNumber = new Random();
		int rng = randomNumber.nextInt(5)+1;
		String colour = " ";

		switch(rng)
		{
			case 1:
				colour = "Red";
				break;

			case 2:
				colour = "Green";
				break;

			case 3:
				colour = "Blue";
				break;

			case 4:
				colour = "Orange";
				break;

			case 5:
				colour = "Yellow";
				break;
		}
		return colour;
	}

	public static String userChoice()
	{
		String guess = JOptionPane.showInputDialog("I'm thinking of a colour. \nis it Red, Green, Blue, Orange, or Yellow?");
		return guess;
	}


}