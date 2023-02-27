import javax.swing.JOptionPane;
import java.util.Random;

 public class Joption18
 {
 public static void main(String[] args)
 {
	 int num1;
	 Random randomNumber = new Random();
	 num1 = randomNumber.nextInt(10) + 1;

	 int choice = JOptionPane.showConfirmDialog(null, "Is the following number greater than 5?\n\n" + num1, "Greater than 5?", JOptionPane.YES_NO_OPTION);

	 if((num1 > 5 && choice == 0) || (num1 < 5 && choice == 1))
	 {
		 JOptionPane.showMessageDialog(null, "Correct!");
	 }
	 else
	 {
		 JOptionPane.showMessageDialog(null, "Sorry, wrong answer. Try again");
	 }



	 System.exit(0);

 }
}