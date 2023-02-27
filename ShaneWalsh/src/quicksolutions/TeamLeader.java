package quicksolutions;

//9. Inherited classes and method overloading
public class TeamLeader extends ITEmployee {
	float bonus;
	
	//Methods
	void setBonus(float bonus)
	{
		this.bonus = bonus;
	}
	
	//Overloaded Method
	void setBonus(float bonus, float salary) { 
		salary += bonus;
	}
	
	//Constructors
	TeamLeader(String name, float hourlyRate, float bonus) {
		this.name = name;
		this.hourlyRate = hourlyRate;
		this.bonus = bonus;
	}

	//Overrides
	@Override
	float calculateSalary() {
		return 60*normalNumOfHours; //9d. uses fixed rate to calculate Salary
	}

	@Override
	void display() {
		System.out.println("Name: " + name + "\nSalary: " + hourlyRate*normalNumOfHours + "\nBonus: " + bonus+ "\n");
	}
	
	public static void main(String[] args) {
		//9e. Jill Adams
		TeamLeader jillAdams = new TeamLeader("Jill Adams", 60, 5000);
		jillAdams.display();
		//14b. TeamLeader object accesses getMasters() method
		TeamLeader shaneWalsh = new TeamLeader("Shane Walsh", 60, 5000);
		shaneWalsh.masters.getMasters();
	}
}
