import java.util.Scanner;


public class Exercise 19
{
	public static void main(String[] args)
	{
		System.out.println("Grade for this score is: " + giveMeGrade());

	}

	public static String giveMeGrade()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter marks: ");
		int marks = keyboard.nextInt();

		String grade = " ";

		if(marks >30 && marks <40)
		{
			grade = "E";
		}
		if(marks >41 && marks <50)
		{
			grade = "D";
		}
		if(marks >51 && marks <60)
		{
			grade = "C";
		}
		if(marks >61 && marks <70)
		{
			grade = "B";
		}
		if(marks >71 && marks <80)
		{
			grade = "A";
		}
		if(marks >81 && marks <90)
		{
			grade = "A+";
		}

		return result;
	}

}