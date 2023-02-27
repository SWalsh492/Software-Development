package quicksolutions;

//5. Abstract class
public abstract class ITEmployee {
	//variables
	int id;
	String name;
	float hourlyRate;
	float normalNumOfHours=37.5f;
	static float examFee=50;	
	//abstract methods
	abstract float calculateSalary();
	abstract void display();
	
	Masters masters = new Masters(); // Creating masters object for TeamLeader
	
	//5C Display exam fee
	static void displayExamFee() {
		System.out.println("The exam fee is " + examFee);
	};

	public static void main(String[] args) {
		displayExamFee();
		
		//12. Polymorphism
		ITEmployee carlFlaherty = new TeamLeader("Carl Flaherty", 50f, 1000);
		carlFlaherty.display();
	}

}
