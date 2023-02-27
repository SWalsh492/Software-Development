import java.util.Scanner;

public class Arrays12
{
	public static void main(String[] args)
	{

		String[] companies = {"Microsoft", "Apple", "Oracle", "Amazon"};

		String[] names = {"Bill Gates", "Steve Jobs", "Larry Ellison", "Jeff Bezos"};

		int[] founded = {1975, 1976, 1977, 1998};

		double[] employees = {166475, 147000, 135000, 1298000};

		Scanner kb = new Scanner(System.in);
		System.out.println("VIEW COMPANY INFORMATION \nCHOOSE FROM ONE OF THE OPTIONS BELOW \nIndex 0: Microsoft \nIndex 1: Apple \nIndex 2: Oracle \nIndex 3: Amazon \n");
		System.out.println("Enter Option: ");
		int input = kb.nextInt();

		do
		{
			switch(input)
			{
				case 0:
					System.out.println("\n=============================== \nCOMPANY: " + companies[0] + "\nFOUNDER: " + names[0] + "\nYEAR FOUNDED: " + founded[0] + "\nYEARS ACTIVE: " + (2022-founded[0]) + "\nNUMBER OF EMPLOYEES: " + employees[0] + "\n===============================");
					break;

				case 1:
					System.out.println("=============================== \nCOMPANY: " + companies[1] + "\nFOUNDER: " + names[1] + "\nYEAR FOUNDED: " + founded[1] + "\nYEARS ACTIVE: " + (2022-founded[1]) + "\nNUMBER OF EMPLOYEES: " + employees[1] + "\n===============================");
					break;

				case 2:
					System.out.println("=============================== \nCOMPANY: " + companies[2] + "\nFOUNDER: " + names[2] + "\nYEAR FOUNDED: " + founded[2] + "\nYEARS ACTIVE: " + (2022-founded[2]) + "\nNUMBER OF EMPLOYEES: " + employees[2] + "\n===============================");
					break;

				case 3:
					System.out.println("=============================== \nCOMPANY: " + companies[3] + "\nFOUNDER: " + names[3] + "\nYEAR FOUNDED: " + founded[3] + "\nYEARS ACTIVE: " + (2022-founded[3]) + "\nNUMBER OF EMPLOYEES: " + employees[3] + "\n===============================");
					break;
			}
			System.out.println("Enter Option: ");
			input = kb.nextInt();
		}while(input > 0);



	}
}