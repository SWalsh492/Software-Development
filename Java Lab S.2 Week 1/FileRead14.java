import java.util.Scanner;
import java.io.*;
import java.lang.Math;

public class FileRead14
{
	public static void main(String[] args) throws IOException
	{

		File myFile = new File("rectangle.txt");
		Scanner inputFile = new Scanner(myFile);

		double length = inputFile.nextDouble();
		double width = inputFile.nextDouble();
		double area = length*width;

		System.out.println("Rectangle: \n" + "Length = " + length + ", width = " + width + ", area = " + area);

		double radius = inputFile.nextDouble();
		double areaCircle = Math.PI * Math.pow(radius,2);
		double circumference = Math.PI * (2 * radius);

		System.out.println("Circle: \n" + "Radius = " + radius + ", area = " + areaCircle + ", circumference = " + circumference);

		inputFile.close();

		PrintWriter outputFile = new PrintWriter("dataOut.txt");
		outputFile.println("Rectangle: \n" + "Length = " + length + ", width = " + width + ", area = " + area);
		outputFile.println("Circle: \n" + "Radius = " + radius + ", area = " + areaCircle + ", circumference = " + circumference);

		outputFile.close();


	}
}