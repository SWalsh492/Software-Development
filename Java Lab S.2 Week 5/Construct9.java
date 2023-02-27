import java.util.Scanner;

public class Construct9
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a temperature: ");
		double input = kb.nextDouble();
		Temp t1 = new Temp();

		t1.setTemp(input);

		if(t1.isWaterFreezing() == true)
		{
			System.out.println("Water will freeze");
		}
		if(t1.isWaterBoiling() == true)
		{
			System.out.println("Water will boil");
		}
		if(t1.isEthylFreezing() == true)
		{
			System.out.println("Ethyl alcohol will freeze");
		}
		if(t1.isEthylBoiling() == true)
		{
			System.out.println("Ethyl alcohol will boil");
		}
		if(t1.isOxygenFreezing() == true)
		{
			System.out.println("Oxygen will freeze");
		}
		if(t1.isOxygenBoiling() == false)
		{
			System.out.println("Oxygen will boil");
		}

	}
}