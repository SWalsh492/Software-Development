import java.util.Scanner;

class Exercise11
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		Temp tempConvert = new Temp();

		System.out.print("Enter the fahrenheit temperature: ");
		double fahrenheit = keyboard.nextDouble();
		tempConvert.setFahrenheit(fahrenheit);

		System.out.println("Celcius: " + tempConvert.getCelcius());
		System.out.println("Kelvin: " + tempConvert.getKelvin());



	}
}