public class calculateDouble
{

	public static void main(String[] args)
	{
		System.out.println(calculate(5,5, 'M'));


	}

	public static double calculate(double num1, double num2, char oper)
	{
		double result = 0;

		if(oper =='A')
		{
			result = (num1+num2);
		}
		else if(oper =='S')
		{
			result = (num1-num2);
		}
		if(oper =='M')
		{
			result = (num1*num2);

		}
		if(oper =='D')
		{
			result = (num1/num2);
		}
		else
		{
			System.out.println("Invalid operator entered!");
		}

		return result;

	}

}