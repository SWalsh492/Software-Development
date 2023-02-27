import java.io.*;
import javax.swing.JOptionPane;
import java.util.Random;

public class Payslip
{
    public static void main(String[] args) throws IOException
 {
	 String filename;
	 String firstName;
	 String surname;
	 String yearEmployed;
	 int correct = 1;
	 String wageslip;
	 int ranNum;
	 String userID;
	 int wage;
	 int choice;

	 do{
		 firstName = JOptionPane.showInputDialog("Enter first name: ");
		 surname = JOptionPane.showInputDialog("Enter surname: ");
		 yearEmployed = JOptionPane.showInputDialog("Enter year of Employment Start: ");

		 Random randomNumber = new Random();
		 ranNum = randomNumber.nextInt(999999)+100000;
		 userID = ("G-" + ranNum + "-" + yearEmployed);

		 switch(yearEmployed)
		 {
			 case "2020":
			 	wage = 5000;
			 	break;

			 case "2019":
			 	wage = 6000;
			 	break;

			 case "2018":
			 	wage = 7000;
			 	break;

			 case "2017":
			 	wage = 8000;
			 	break;

			 case "2016":
			 	wage = 9000;
			 	break;

			 case "2015":
			 	wage = 10000;
			 	break;

			 default:
			 	wage = 15000;
			 	break;

		 }
		 wageslip =("========== WAGE SLIP ========== \nName: " + firstName + " " + surname + "\nEmployee ID: " + userID + "\n======================\nANNUAL WAGE: " + wage + "\n\n");


		 correct = JOptionPane.showConfirmDialog(null, wageslip + "Are all details correct?");


	 	if(correct == 0)
	 	{
			JOptionPane.showMessageDialog(null, "Data Entry Complete! :)");
		}
		else if(correct == 2)
		{
			correct++;
		}
		else
		{
			break;
		}

	 }while(correct==1);

	 choice = JOptionPane.showConfirmDialog(null, wageslip + "Would you like to generate wage slips?");

	 if(choice == 0)
	 {
		 for(int i = 1; i < 12; i++)
		 {
			 filename = ("WAGEFOLDER/PAYSLIP_Gates - " + firstName + "MONTH_"+ i+ ".txt");
			 PrintWriter outputFile = new PrintWriter(filename);
			 outputFile.printf("========== WAGE SLIP ==========\nNAME: %s \nDATE: 01/%d/20\n====================\nANNUAL WAGE: %d\nMONTHLY WAGE: %d \nTAX THIS MONTH: %d", firstName, i,wage, wage/12, );
		 }
	 }

 }
}