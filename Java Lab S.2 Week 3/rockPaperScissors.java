import javax.swing.JOptionPane;
import java.util.Random;

public class rockPaperScissors
{
	public static void main(String[] args)
	{
		String computer = computerChoice();
		String user = userChoice();
		determineWinner(computer, user);
	}

	public static String computerChoice()
	{
		Random randomNumber = new Random();
		int rng = randomNumber.nextInt(3)+1;
		String choice = " ";
		switch(rng)
		{
			case 1:
				choice = "rock";
				break;
			case 2:
				choice = "paper";
				break;
			case 3:
				choice = "scissors";
				break;
		}
		return choice;
	}

	public static String userChoice()
	{
		String choice = JOptionPane.showInputDialog("Enter rock, paper or scissors");
		return choice;
	}

	public static void determineWinner(String computer, String user)
		   {
		      // String to hold the output.
		      String output;

		      // Start building the output string with the computer's
		      // and the user's choices.
		      output =  "The computer's choice was " + computer + ".\n";
		      output += "The user's choice was " + user + ".\n\n";

		      // Determine the winner and continue building the
		      // output string.
		      if (user.equalsIgnoreCase("rock"))
		      {
		        if (computer.equalsIgnoreCase("scissors"))
		            output += "Rock smashes scissors.\nThe user wins!";
		        else if (computer.equalsIgnoreCase("paper"))
		            output += "Paper wraps rock.\nThe computer wins!";
		        else
		            output += "The game is tied!\nGet ready to play again...";
		      }
		      else if (user.equalsIgnoreCase("paper"))
		      {
		         if (computer.equalsIgnoreCase("scissors"))
		            output += "Scissors cut paper.\nThe computer wins!";
		         else if (computer.equalsIgnoreCase("rock"))
		            output += "Paper wraps rock.\nThe user wins!";
		        else
		            output += "The game is tied!\nGet ready to play again...";
		      }
		      else if (user.equalsIgnoreCase("scissors"))
		      {
		         if (computer.equalsIgnoreCase("rock"))
		            output += "Rock smashes scissors.\nThe computer wins!";
		        else if (computer.equalsIgnoreCase("paper"))
		            output += "Scissors cut paper.\nThe user wins!";
		        else
		            output += "The game is tied!\nGet ready to play again...";
		      }

		      // Display the game results.
		      JOptionPane.showMessageDialog(null, output);
	}

}