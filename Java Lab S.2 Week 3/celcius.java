import java.util.Scanner;
import java.io.*;



public class celcius
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("Fahrenheit		Celcius");
		System.out.println("----------------------------------------");

		for(int farenheit = 60; farenheit <= 80; farenheit ++)
		{
			System.out.println(farenheit + "		" + celcius(farenheit));
		}

	}

	public static double celcius(double tempInFarenheit)
	{
		return(0.55555 * (tempInFarenheit - 32));
	}

}