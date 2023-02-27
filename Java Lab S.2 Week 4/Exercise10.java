import java.util.Scanner;

class Exercise10
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		TestScores score1 = new TestScores();

		System.out.print("Enter test score #1: ");
		double testScore = keyboard.nextDouble();
		score1.setTestScore1(testScore);

		TestScores score2 = new TestScores();

		System.out.print("Enter test score #2: ");
		testScore = keyboard.nextDouble();
		score2.setTestScore2(testScore);

		TestScores score3 = new TestScores();

		System.out.print("Enter test score #3: ");
		testScore = keyboard.nextDouble();
		score3.setTestScore3(testScore);

		System.out.println("The average test score is " + score3.getAverage());


	}
}