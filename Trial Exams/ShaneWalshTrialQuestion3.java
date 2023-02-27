import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;


public class ShaneWalshTrialQuestion3
{
	public static void main(String[] args)
	{
		String name;
		int age;
		int num;
		String history;
		int carryOn = 0;
		int choice;

		JOptionPane.showMessageDialog(null, "Welcome to the Java Adder Program");

		name = JOptionPane.showInputDialog(null, "Enter your name: ");
		String input = JOptionPane.showInputDialog(null, "Enter your age: ");
		age = Integer.parseInt(input);
		JOptionPane.showMessageDialog(null, "Hi " + name + "\nYou were born in " + (2021-age));

		input = JOptionPane.showInputDialog(null, "Enter the first number: ");
		num = Integer.parseInt(input);
		history = input;

		do
		{
			choice = JOptionPane.showConfirmDialog(null, "Do you want to add another number to this? \n Current number is " + num);

			if(choice == 0)
			{
				input = JOptionPane.showInputDialog(null, "Enter another number: ");
				history = history + "\n" + input;
				num = num + Integer.parseInt(input);

			}
			else
			{
				carryOn++;
			}

		}while(carryOn == 0);

		JOptionPane.showMessageDialog(null, "Calculations complete.\nThe numbers entered were: \n" + history + "\n--------\nTOTAL: " + num);




	}
}