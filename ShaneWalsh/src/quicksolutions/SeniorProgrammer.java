package quicksolutions;

//7. Final class and static keyword
public final class SeniorProgrammer extends Programmer {
	
	public SeniorProgrammer(int id, String name, float hourlyRate, int numHolidays) {
		super(id, name, hourlyRate, numHolidays);
		
	}
	
	static void setExamFee(float examFee) {
		ITEmployee.examFee = examFee;
	}
	
	public static void main(String[] args)
	{
		//7c. Set exam fee
		setExamFee(100);
		
		//7d. Two objects
		SeniorProgrammer amySmith = new SeniorProgrammer(003, "Amy Smith", 150.00f, 20);
		SeniorProgrammer paulKelly = new SeniorProgrammer(003, "paul Kelly", 150.00f, 20);
		amySmith.display();
		paulKelly.display();
		SeniorProgrammer.displayExamFee();

	}
	
}
