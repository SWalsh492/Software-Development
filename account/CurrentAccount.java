package account;

public class CurrentAccount extends BankAccount {

	float overDraftLimit;
	@Override
	void makeWithdrawal(float withDrawal) throws AccountBalanceException {
		if(accountBalance-withDrawal<overDraftLimit) {
			throw new AccountBalanceException("Cannot make " + "a withdrawel of " + withDrawal + " as overdraft exceeded "+overDraftLimit);
		}
		super.makeWithdrawal(withDrawal);
	}
	
	public CurrentAccount() {
	}

	public CurrentAccount(int accountNumber) {
		super(accountNumber);
	}

	public CurrentAccount(int theNumber, String theName) {
		super(theNumber, theName);
	}

	public CurrentAccount(int theNumber, String theName, float theBalance, float theOverDraft) {
		super(theNumber, theName, theBalance);
		overDraftLimit = theOverDraft;
	}

	public CurrentAccount(BankAccount anAccount) {
		super(anAccount);
	}

	@Override
	void displayBalance() {
		super.displayBalance(); // calls method from BankAccount
		System.out.println("Overdraft is " + overDraftLimit);
	}
	
	
	// new Method
	void setOverDraftLimit(float theLimit) {
		overDraftLimit=theLimit;
	}
	public static void main(String[] args) {
		CurrentAccount joeAcc = new CurrentAccount(444, "joe", 90, 1000f);
		joeAcc.displayBalance();
		BankAccount annAcc = new BankAccount(987, "Ann", 90f);
		annAcc=joeAcc;
		//joeAcc=annAcc; super class cannot overwrite child class
		
		
		try {
			joeAcc.makeWithdrawal(1000000000);
		} catch (AccountBalanceException e) {
			// Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
