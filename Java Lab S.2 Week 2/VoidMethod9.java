public class VoidMethod9
{

	public static void main(String[] args)
	{
		calculate(5,4, 'D');

	}

	public static void calculate(double num1, double num2, char oper)
	{
		if(oper =='A')
		{
			System.out.printf("Number 1: %.1f \nNumber 2: %.1f \nOperator: %c \nResult: %.2f \n", num1, num2, oper, (num1 + num2));
		}
		else if(oper =='S')
		{
			System.out.printf("Number 1: %.1f \nNumber 2: %.1f \nOperator: %c \nResult: %.2f \n", num1, num2, oper, (num1 - num2));
		}
		if(oper =='M')
		{
			System.out.printf("Number 1: %.1f \nNumber 2: %.1f \nOperator: %c \nResult: %.2f \n", num1, num2, oper, (num1*num2));
		}
		if(oper =='D')
		{
			System.out.printf("Number 1: %.1f \nNumber 2: %.1f \nOperator: %c \nResult: %.2f \n", num1, num2, oper, (num1/num2));
		}
		else
		{
			System.out.println("Invalid operator entered!");
		}

	}
}