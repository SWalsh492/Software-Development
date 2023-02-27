import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile15
{
    public static void main(String[] args) throws IOException
 {

	 String product;
	 String num;
	 int quantity;

	 PrintWriter outputFile = new PrintWriter("Receipt.txt");

	 product = JOptionPane.showInputDialog("Enter product: (Coke/Pepsi/Evian) ");
	 num = JOptionPane.showInputDialog("Enter quantity: ");
	 quantity = Integer.parseInt(num);


	 switch(product)
	 {
		 case "Coke":
		 case "coke":
		 	JOptionPane.showMessageDialog(null, "Receipt Complete");
		 	outputFile.println("============================");
		 	outputFile.println("PURCHASE: " + product);
		 	outputFile.println("PRICE: 1.00 dollar");
		 	outputFile.println("Quantity: " + quantity);
		 	outputFile.println("Total Cost: " + (4*1.00));
		 	outputFile.println("============================");
		 	break;

		 case "Pepsi":
		 case "pepsi":
		 	JOptionPane.showMessageDialog(null, "Receipt Complete");
			outputFile.println("============================");
			outputFile.println("PURCHASE: " + product);
			outputFile.println("PRICE: 0.95 dollars");
			outputFile.println("Quantity: " + quantity);
			outputFile.println("Total Cost: " + (4*0.95));
		 	outputFile.println("============================");
		 	break;

		 case "Evian":
		 case "evian":
		 	JOptionPane.showMessageDialog(null, "Receipt Complete");
			outputFile.println("============================");
			outputFile.println("PURCHASE: " + product);
			outputFile.println("PRICE: 0.75 dollars");
			outputFile.println("Quantity: " + quantity);
			outputFile.println("Total Cost: " + (4*0.75));
			outputFile.println("============================");
		 	break;

		 default:
		 	outputFile.println("============================");
			outputFile.println("Not a valid option");
			outputFile.println("============================");
		 	break;




	 }
	 outputFile.println("");

	 outputFile.close();
 }
}