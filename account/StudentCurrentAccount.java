package account;

public class StudentCurrentAccount extends CurrentAccount implements StudentStateSubsidy{

	int gradYear;
	public StudentCurrentAccount() {
	}

	public StudentCurrentAccount(int accountNumber) {
		super(accountNumber);
	}

	public StudentCurrentAccount(int theNumber, String theName) {
		super(theNumber, theName);
	}

	public StudentCurrentAccount(int theNumber, String theName, float theBalance, float theOverDraft, int theYear) {
		super(theNumber, theName, theBalance, theOverDraft);
		gradYear=theYear;
		System.out.println("StudentAcc construction");
	}

	public StudentCurrentAccount(BankAccount anAccount) {
		super(anAccount);
	}

	@Override
	void displayBalance() {
		super.displayBalance();
		System.out.println("Grad year is " + " " + gradYear);
	}
	
	
	
	@Override
	public void addStudentStateSubsidy() {
		accountBalance=accountBalance+STUDENT_STATE_SUBSIDY;
	}
	
	public static void main(String[] args) {
		StudentCurrentAccount joeAcc = new StudentCurrentAccount(333, "Jim", 90f, 500f, 2025);
		StudentCurrentAccount testAcc = new StudentCurrentAccount();
		testAcc.addStudentStateSubsidy();
	}

	

}
