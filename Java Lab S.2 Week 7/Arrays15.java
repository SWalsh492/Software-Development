import java.util.Scanner;

public class Arrays15
{
	public static void main(String[] args)
	{

		int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};

		int[] hours = new int[7];

		double[] wages = new double[7];

		double payrate = 0;

		for(int i = 0; i < employeeId.length; i++)
		{
			System.out.println("Employee ID " + i + ": " + employeeId[i]);
		}

		Scanner kb2 = new Scanner(System.in);
		boolean yesNo = false;
		String edit = "Y";
		do
		{
			System.out.println("Choose an index to edit: ");
			int input = kb2.nextInt();
			System.out.println("Employee ID: " + employeeId[input]);
			System.out.println("Enter hours worked: ");
			hours[input] = kb2.nextInt();
			System.out.println("Enter hourly pay rate: ");
			payrate = kb2.nextDouble();
			wages[input] = hours[input]*payrate;

			System.out.println("Employee ID: " + employeeId[input] + "\nHours Worked: " + hours[input] + "\nPay Rate: " + payrate + "\nWages: " + wages[input]);

			System.out.println("Edit another? (Y or N)");
			edit = kb2.nextLine();
			edit = kb2.nextLine();

			if(edit == "Y")
			{
				yesNo = true;
			}
			else
			{
				yesNo = false;
			}

		}while(yesNo == true);


	}
}