import java.util.Scanner;


public class JavaConvertCurrency
{
	public static void main(String[] args)
	{

		double amount;
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("Enter amount: ");
		amount = keyboard.nextDouble();
		
		char convert;
		System.out.println("Enter A to convert dollars to euros or B to convert euros to dollars: ");
		convert = keyboard.next().charAt(0);
		keyboard.close();
		
		switch(convert)
		{
			case 'a':
			case 'A':
				System.out.printf("%f dollars is %,.2f euros", amount, amount*0.86143522);
				break;
			case 'b':
			case 'B':
				System.out.printf("%f euros is %,.2f dollars", amount, amount/0.86142522);
				break;
			default:
				System.out.printf("Incorrect Input");




		}



	}
}