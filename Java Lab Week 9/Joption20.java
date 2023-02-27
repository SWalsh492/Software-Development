import javax.swing.JOptionPane;
import java.util.Random;

 public class Joption20
 {
 public static void main(String[] args)
 {
	 int num1;
	 Random randomNumber = new Random();
	 num1 = randomNumber.nextInt(100)+1;


	 for(int i = 1; i <= 6; i++)
	 {

		 String input = JOptionPane.showInputDialog(null, "Guess a number between 1 and 100:");
		 int guess = Integer.parseInt(input);

		 if(guess > num1)
		 {
			 JOptionPane.showMessageDialog(null, "Too high", "turn " + i, JOptionPane.ERROR_MESSAGE);
		}
	 	else if(guess < num1)
	 	{
			JOptionPane.showMessageDialog(null, "Too low", "turn " + i, JOptionPane.ERROR_MESSAGE);
	 	}
	 	else
	 	{
			JOptionPane.showMessageDialog(null, "Congratulations! You win!", "Winner winner, chicken Dinner!", JOptionPane.INFORMATION_MESSAGE);
			break;
		}
	 }

	 JOptionPane.showMessageDialog(null, "Sorry, you didn't win. The answer was " + num1, "That's a shame", JOptionPane.WARNING_MESSAGE);



	 System.exit(0);

 }
}