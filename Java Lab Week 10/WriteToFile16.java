import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile16
{
    public static void main(String[] args) throws IOException
 {

	 String name;
	 String num;
	 int another = 0;

	 FileWriter fwriter = new FileWriter("Payroll.txt", true);
	 PrintWriter outputFile = new PrintWriter(fwriter);

	 do
	 {
		 name = JOptionPane.showInputDialog("Enter Employee Name: ");

		 int option = JOptionPane.showConfirmDialog(null, "Is this employee permanent?");

		 if(option == 0)
		 {
			 outputFile.println("===================");
			 outputFile.println("EMPLOYEE: " + name);
			 outputFile.println("WAGE: 250 dollars");
			 outputFile.println("===================");

			 System.out.println("===================");
			 System.out.println("EMPLOYEE: " + name);
			 System.out.println("WAGE: 250 dollars");
			 System.out.println("===================");
		}
	 	else if(option == 1)
	 	{
		 	outputFile.println("===================");
		 	outputFile.println("EMPLOYEE: " + name);
		 	outputFile.println("WAGE: 125 dollars");
		 	outputFile.println("===================");

		 	System.out.println("===================");
		 	System.out.println("EMPLOYEE: " + name);
		 	System.out.println("WAGE: 125 dollars");
		 	System.out.println("===================");
	 	}
	 	else
	 	{
		 	JOptionPane.showMessageDialog(null, "Finished");
	 	}

	 	another = JOptionPane.showConfirmDialog(null, "Add another record?");


 	}while(another != 1 && another == 0);

 	outputFile.close();
 }
}