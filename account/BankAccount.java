package account;

public class BankAccount extends Account implements StateSubsidy{
//attributes
	float accountBalance;
	static float euroConversionRate;
	String firstName, lastName;
	Loan loan = new Loan(); // composition at work
	
	//Add in public modifier
	// Constructors
	public BankAccount() { // Explicit Default Constructor
		accountName = "Default";
		accountBalance = 0f;
		accountNumber = 999;
		
	}
	public BankAccount(int accountNumber) { // Constructor 1
		this.accountNumber = accountNumber;
	}
	public BankAccount(int theNumber, String theName) { // Constructor 1
		this(theNumber);
		accountName = theName;
	}
	
	public BankAccount(int theNumber, String theName, float theBalance) { // Overload of constructor 1
		this(theNumber, theName); // calls constructor
		accountBalance = theBalance;
		System.out.println("bankAcc Construction");
	}
	
	// Copy Constructor - Separate area in memory created
	BankAccount(BankAccount anAccount){
		accountNumber = anAccount.accountNumber;
		accountBalance = anAccount.accountBalance;
	}
	
	
	//methods
		// friendly/package access
		
		//Add in public modifier
		
	
		// sees object as a string -from object class
	@Override
		public String toString() {
			return ("Account number is "+ accountNumber + " Account name is " + accountName + firstName + lastName);
		}
	
	
	@Override
		void display() {
	System.out.println("Account number is " + accountNumber);
	System.out.println("Account name is "+ accountName);
		}
	void displayBalance() {
	display();// calls display() method
	System.out.println("Account Balance is "+accountBalance);
	System.out.println("Euro Conversion Rate is " +euroConversionRate);
	}
	void makeWithdrawal(float withDrawal) throws AccountBalanceException {
		accountBalance=accountBalance-withDrawal;
	}
	
	//Overload this method
	void makeWithdrawal(int currencyType, float withDrawal){
		float convertedWidthdrawel=0;
		switch (currencyType) 
		{
			case 0: // euros
				convertedWidthdrawel=withDrawal;
				break;
				
			case 1: // sterling
				convertedWidthdrawel=euroConversionRate*withDrawal;
				break;
				
			default:
				throw new AccountCurrencyException("Invalid currency" + " type " + currencyType);
		}
		accountBalance=accountBalance-withDrawal;
	}
	void makeLodgement(float lodgement) {
		accountBalance=accountBalance+lodgement;
		
	}
	
	@Override
	public void addStateSubsidy(float subsidy) {
		accountBalance = accountBalance+STATE_SUBSIDY;
	}
	
	// redefine static method in interface and use same method signature
	// never override a static method, only redefine
	public static void displaySubsidy() {
		System.out.println("Subsidy for Bank Account is" +" " + STATE_SUBSIDY);
	}
	//override the default / defender interface method
	@Override
		public void displayTaxedSubsidy() {
			StateSubsidy.super.displayTaxedSubsidy();
			System.out.println("For Bank Account");
		}
	
	// facilitates cascaded method calls
	BankAccount setFirstName(String first) {
		firstName=first;
		return this;
	}
	
	BankAccount setLastName(String last) {
		lastName=last;
		return this;
	}
	
	
	
	
	
	
	//Override the equals() method to compare actual objects
	@Override
		public boolean equals(Object obj) {
		BankAccount other = (BankAccount)obj; // Casts incoming object to a bankAcc obj
		if(other.accountNumber==accountNumber && 
				other.accountName==accountName && 
				other.accountBalance==accountBalance)
			return true;
		else
			return false;
		}
	//create a static method
	static void setEuroConversionRate(float newRate) {
		euroConversionRate=newRate;
	}
	public static void main(String[] args) {
		// use interface static method - specific to Interface always
		StateSubsidy.displaySubsidy();
		// use same static class method
		BankAccount.displaySubsidy();
	/*	BankAccount myAccount = new BankAccount();
		myAccount.accountNumber=777;
		myAccount.accountName="Shane";
		myAccount.accountBalance=1000000f; */
		// Create objects
		BankAccount myAccount = new BankAccount(688, "Shane");
		BankAccount defaultAccount = new BankAccount();
		BankAccount shaneAccount = new BankAccount(myAccount);
		BankAccount myCatsAccount = new BankAccount(656, "Cat",200f);
		myAccount.makeWithdrawal(6, 90); // unchecked exception
		
		myAccount.makeLodgement(80f);
		myAccount.displayBalance();
		shaneAccount.displayBalance();
		myAccount.displayBalance();
		
		shaneAccount = myCatsAccount; // Aliasing at work
		shaneAccount.displayBalance();
		myCatsAccount.displayBalance();
		
		System.out.println(shaneAccount.equals(myCatsAccount));
		System.out.println(shaneAccount == myCatsAccount);
		System.out.println(shaneAccount.equals(defaultAccount));
		System.out.println("Static at work");
		//shaneAccount.setEuroConversionRate(.3f); Non static use
		BankAccount.setEuroConversionRate(5f);
		shaneAccount.displayBalance();

		System.out.println("Overloaded Method");
		myAccount.makeWithdrawal(1, 60);
		
		//toString method at work 0 - object prints as a string
		System.out.println("ToString at work");
		System.out.println(myAccount);
		System.out.println("My details are " + myAccount);
		myAccount.setFirstName("Shane").setLastName("Walsh");
		System.out.println("My account is " +myAccount);
		
		// composition at work
		myAccount.loan.setLoanAmount(80);
		
		// interface method
		myAccount.addStateSubsidy(500);
		
		
		

	}//end main method 
	
	

}//end class BankAccount
