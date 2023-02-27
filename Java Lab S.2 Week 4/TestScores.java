public class TestScores
{
	private double testScore1;
	private double testScore2;
	private double testScore3;

	// Setters
	public void setTestScore1(double test1)
	{
		testScore1 = test1;
	}

	public void setTestScore2(double test2)
	{
		testScore2 = test2;
	}

	public void setTestScore3(double test3)
	{
		testScore3 = test3;
	}



	// Getters

	public double getTestScore1()
	{
		return testScore1;
	}

	public double getTestScore2()
	{
		return testScore2;
	}

	public double getTestScore3()
	{
		return testScore3;
	}

	public double getAverage()
	{
		double average = (testScore1 + testScore2+ testScore3)/ 3;
		return average;
	}

}