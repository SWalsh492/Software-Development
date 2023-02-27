import javax.swing.JOptionPane;

public class calculateRetail
{
	public static void main(String[] args)
	{
		String input;
		input = JOptionPane.showInputDialog("Enter the item's wholesale cost.");
		double wholesale = Double.parseDouble(input);

		input = JOptionPane.showInputDialog("Enter the iitem's percentage.");
		double markup = Double.parseDouble(input);

		JOptionPane.showMessageDialog(null,"The item's retail price is eur " + calculateRetail(wholesale, markup));





	}

	public static double calculateRetail(double wholesale, double markup)
	{
		double retail = wholesale + (markup/100*wholesale);
		return retail;

	}


}