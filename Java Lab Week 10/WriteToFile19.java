import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile19
{
    public static void main(String[] args) throws IOException
 {
	 String filename;
	 String firstName;
	 String lastName;
	 String occupation;
	 String birthYear;
	 int birthYearInt;
	 String birthMonth;
	 int another = 0;

	 do{
		 firstName = JOptionPane.showInputDialog("Enter first name: ");
		 lastName = JOptionPane.showInputDialog("Enter surname: ");
		 occupation = JOptionPane.showInputDialog("Enter occupation: ");
		 birthYear = JOptionPane.showInputDialog("Year of birth: ");
		 birthYearInt = Integer.parseInt(birthYear);

		 birthMonth = JOptionPane.showInputDialog("Month of birth: ");

		 filename = ("PERSONNEL FILES/" + firstName + " - " + lastName + ".txt");
		 PrintWriter outputFile = new PrintWriter(filename);

		 outputFile.println("====== PERSONAL FILE ======");
		 outputFile.println("Name: " + firstName + " " + lastName);
		 outputFile.println("===========================");
		 outputFile.println("DATE OF BIRTH: " + birthMonth + "/" + birthYear);
		 outputFile.println("AGE: " + (2021-birthYearInt));
		 outputFile.println("============================");
		 outputFile.println("OCCUPATION: "+ occupation);
		 outputFile.println("=============================");

		 outputFile.close();

		 JOptionPane.showMessageDialog(null, "File generated: "+ filename);

		 another = JOptionPane.showConfirmDialog(null, "Add another employee?");
	 	if(another == 1 || another ==2)
	 	{
			another++;
		}

	 }while(another==0);

	 JOptionPane.showMessageDialog(null, "Data Entry Complete! :)");

 }
}