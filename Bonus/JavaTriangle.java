import java.util.Scanner;
public class JavaTriangle
{
	public static void main(String[] args)
	{
		int num1 = 0;
		int size;
		Scanner keyboard = new Scanner(System.in);


		do
		{
			System.out.print("Specify size of triangle: ");
			size = keyboard.nextInt();
			for (int i = 0; i <= size; i++, num1++)
			{
				for (int x = 1; x <= num1; x++)
				{
					System.out.print("*");
				}
					System.out.print("\n");
				}
				for (int i = 0; i <= size; i++, num1--)
				{
					for (int x = 1; x <= num1; x++)
					{
					System.out.print("*");
					}
					System.out.print("\n");
			}

		}while(size != 0);




	}

}
