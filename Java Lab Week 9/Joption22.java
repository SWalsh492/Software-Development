import javax.swing.JOptionPane;
import java.util.Random;

 public class Joption22
 {
 public static void main(String[] args)
 {
	 int gamesWon = 0;
	 int yourDice;
	 int dealerDice;
	 String name;
	 int cash = 100;
	 int bet;

	 name = JOptionPane.showInputDialog("Enter your name: ");

	 JOptionPane.showMessageDialog(null,"Greetings " + name + ", welcome to roll the dice! \n\nYou will start with 100 euros in your wallet! \n\nThe game ends when you are broke, or when you have doubled your money to 200 euros.\n\nGood luck");

	 while(cash > 0 && cash < 200)
	 {
		 String input = JOptionPane.showInputDialog("Place your bet (1 - " +cash + "): ");
		 bet = Integer.parseInt(input);
		 Random randomNumber = new Random();
	 	 yourDice = randomNumber.nextInt(6)+1;
	 	 dealerDice = randomNumber.nextInt(6)+1;
	 	 JOptionPane.showMessageDialog(null,"Rolling the dice...");
	 	 if(yourDice > dealerDice)
	 	 {
			 JOptionPane.showMessageDialog(null, "YOU WIN!!!!!!\nThe dealer rolled a "+ dealerDice + "\n"+ name + " rolled a " + yourDice);
			 cash += bet;
			 JOptionPane.showMessageDialog(null, "You now have " + cash + " euros left...");
			 gamesWon++;
		}
		else if(dealerDice > yourDice)
		{
			JOptionPane.showMessageDialog(null, "YOU Lose!\nThe dealer rolled a "+ dealerDice + "\n"+ name + " rolled a " + yourDice);
			cash -= bet;
			JOptionPane.showMessageDialog(null, "You now have " + cash + " euros left...");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "No winner!\nThe dealer rolled a "+ dealerDice + "\n"+ name + " rolled a " + yourDice);
		}
	 }

	 JOptionPane.showMessageDialog(null, "You won " + gamesWon + "games!");


	 System.exit(0);

 }
}