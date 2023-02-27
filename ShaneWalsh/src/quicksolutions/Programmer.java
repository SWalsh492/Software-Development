package quicksolutions;

//6. Method Overrides
public class Programmer extends ITEmployee implements JavaCertification{
	int numHolidays;
	
	//6b. Constructor
	public Programmer(int id, String name, float hourlyRate, int numHolidays) {
		this.id = id;
		this.name = name;
		this.hourlyRate = hourlyRate;
		this.numHolidays = numHolidays;
	}
	
	//Overrides
	@Override
	float calculateSalary() {
		return hourlyRate*normalNumOfHours;
	}
	
	//6d. Display
	@Override
	void display() {
		System.out.println("ID: " + id+ "\nName: " + name + "\nNumber of Holidays: " + numHolidays + "\nSalary: " + hourlyRate*normalNumOfHours + "\n");
	}
	
	//10e. Pay exam fee
	@Override
	public void payExamFee() {
		examFee = DISCOUNT_FACTOR*EXAM_FEE;
	}
	
	public static void main(String[] args) {
		//6c. joeSmith
		Programmer joeSmith = new Programmer(003, "Joe Smith", 150.00f, 20);
		System.out.printf("Joe Smith's salary is %.2f\n\n",joeSmith.calculateSalary());
		joeSmith.display();
		
		//11. Static methods in interface and class
		JavaCertification.displayExamFee();
		ITEmployee.displayExamFee();
	}
}
