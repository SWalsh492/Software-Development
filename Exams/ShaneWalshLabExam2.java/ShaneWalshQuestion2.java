// Shane Walsh, G00406694, 14/12/21

import javax.swing.JOptionPane;

public class ShaneWalshQuestion2
{
	public static void main(String[] args)
	{
		// Declaration of my variables and welcome message
		double dollars;
		double euros;
		int another;

		JOptionPane.showMessageDialog(null, "Welcome to the Java Conversion Program.");

		// Prompt user for conversion amount, allows for repeated conversions
		do
		{
			String input = JOptionPane.showInputDialog(null, "Enter dollar amount to be converted: ");
			dollars = Double.parseDouble(input);

			euros = ((dollars/100)*88);

			another = JOptionPane.showConfirmDialog(null, dollars + " dollars is " + euros + " Euros.\nDo you want to perform another conversion?", "choose an Option", JOptionPane.YES_NO_OPTION);

		}while(another != 1 && another == 0);
	}
}