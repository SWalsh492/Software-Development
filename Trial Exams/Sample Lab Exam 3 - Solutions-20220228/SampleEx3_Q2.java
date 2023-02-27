public class SampleEx3_Q2
{
    public static void main(String[] args)
    {
        calculate(2, 6, 'm');
        calculate(2, 6, 'a');
        calculate(2, 6, 'x');
    }

	/**
		The calculate method displays the addition or multiplication of two number passed
	*/
    public static void calculate(int number1, int number2, char operator)
    {
		switch(operator)
		{
			case 'm': case 'M':
    	    System.out.println(number1 + " multiplied by " + number2 + " is: " + (number1 * number2));
    	    break;

    	    case 'a': case 'A':
			System.out.println(number1 + " plus " + number2 + " is: " + (number1 + number2));
			break;

			default:
			System.out.println("This is not a valid operator!");
			break;
		}
    }
}