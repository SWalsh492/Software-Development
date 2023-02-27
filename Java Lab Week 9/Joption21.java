import javax.swing.JOptionPane;
import java.util.Random;

 public class Joption21
 {
 public static void main(String[] args)
 {
	 int gamesWon = 0;
	 int yourDice;
	 int dealerDice;
	 String name;

	 name = JOptionPane.showInputDialog("Enter your name: ");

	 for(int i = 1; i <= 10; i++)
	 {
		 Random randomNumber = new Random();
	 	 yourDice = randomNumber.nextInt(6)+1;
	 	 dealerDice = randomNumber.nextInt(6)+1;
	 	 JOptionPane.showMessageDialog(null,"Rolling the dice...");
	 	 if(yourDice > dealerDice)
	 	 {
			 JOptionPane.showMessageDialog(null, "YOU WIN!!!!!!\nThe dealer rolled a "+ dealerDice + "\n"+ name + " rolled a " + yourDice);
			 gamesWon++;
		}
		else if(dealerDice > yourDice)
		{
			JOptionPane.showMessageDialog(null, "YOU Lose!\nThe dealer rolled a "+ dealerDice + "\n"+ name + " rolled a " + yourDice);
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