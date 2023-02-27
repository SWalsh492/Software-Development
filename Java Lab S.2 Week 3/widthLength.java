import javax.swing.JOptionPane;

public class widthLength
{
	public static void main(String[] args)
	{
		double length;
		double width;
		double area;

		length = getLength();

		width = getWidth();

		area = getArea(length, width);

		displayData(length, width, area);

	}

	public static double getLength()
	{
		String input;
		input = JOptionPane.showInputDialog("Enter the rectangle's length.");
		double length = Double.parseDouble(input);
		return length;
	}
	public static double getWidth()
	{
		String input;
		input = JOptionPane.showInputDialog("Enter the rectangle's width.");
		double width = Double.parseDouble(input);
		return width;
	}
	public static double getArea(double length, double width)
	{
		double area = length*width;
		return area;
	}
	public static void displayData(double length, double width, double area)
	{
		JOptionPane.showMessageDialog(null,"Length = " + length + "\nWidth = " + width + "\nArea = " + area);
	}

}