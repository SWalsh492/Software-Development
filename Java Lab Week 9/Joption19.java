import javax.swing.JOptionPane;
import java.util.Random;

 public class Joption19
 {
 public static void main(String[] args)
 {
	 int num1;
	 int num2;
	 int correct = 0;

	 for(int i = 1; i <= 10; i++)
	 {
		 Random randomNumber = new Random();
		 num1 = randomNumber.nextInt(100)+1;
		 num2 = randomNumber.nextInt(100)+1;

		 int choice = JOptionPane.showConfirmDialog(null, "Is "+ num1 + " greater than " + num2, "Which is greater?", JOptionPane.YES_NO_OPTION);

		 if((num1 > num2 && choice == 0) || (num1 < num2 && choice == 1))
		 {
			 JOptionPane.showMessageDialog(null, "Correct!");
			 correct++;
		}
	 	else
	 	{
			JOptionPane.showMessageDialog(null, "Sorry, wrong answer. Try again");
	 	}
	 }
	 JOptionPane.showMessageDialog(null, "You got " + correct + " answers correct.");
	 System.exit(0);

 }
}