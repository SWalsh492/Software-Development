package quicksolutions;

//8. Constructor, this keyword, toString
public class BusinessAnalyst extends ITEmployee {
	int numHolidays;
	float hoursWorked = 37.5f;
	
	//Constructors
	public BusinessAnalyst(int id, String name, float hourlyRate) {
		this.id = id;
		this.name = name;
		this.hourlyRate = hourlyRate;
	}
	
	public BusinessAnalyst(int id, String name, float hourlyRate, int numHolidays) {
		this(id, name, hourlyRate); //8b. first constructor called within second
		this.numHolidays = numHolidays; //8c. Use of this
	}

	// Overrides
	//8e. Calculate Salary
	@Override
	float calculateSalary() {
		return hoursWorked*hourlyRate;
	}

	//8e. Displays salary when above 37.5
	@Override
	void display() {
		if(hoursWorked > 37.5)
		{
			System.out.printf("ID: %d \nName: %s \nNumber of Holidays: %d \nSalary: %.2f \n", id, name, numHolidays, calculateSalary());
		}
		else
		{
			System.out.printf("ID: %d \nName: %s \nNumber of Holidays: %d \n", id, name, numHolidays);
		}
	}
	
	//8f. toString
	@Override
	public String toString() {
		return String.format("\nName: " + name + "\nID: " + id + "\n");
	}
	
	//13b. Overridden equals method to compare two objects
	@Override
	public boolean equals(Object obj) {
		BusinessAnalyst source = (BusinessAnalyst)obj;
		return name.equals(source.name) && (id == source.id);
	}
	
	public static void main(String[] args) {
		//8d. Mary Kelly
		BusinessAnalyst maryKelly = new BusinessAnalyst(005, "Mary Kelly", 100, 20);
		maryKelly.hoursWorked = 37.5f + 5f;
		maryKelly.display();
		System.out.println(maryKelly.toString()); // 8f. object maryKelly displays with toString
		
		//13a. myHusband and myWife
		BusinessAnalyst myWife = new BusinessAnalyst(006, "Mary Poppins", 100, 20);
		BusinessAnalyst myHusband = new BusinessAnalyst(006, "Mary Poppins", 100, 20);
		//13b. equals() with the two objects
		System.out.println("myWife equals myHusband: " + myWife.equals(myHusband));
	}

}
