package account;

public interface StateSubsidy {
	// all interface variables are public, final and static
	// so redundant to add in these modifiers
	float STATE_SUBSIDY=100;
	float TAX_RATE = .1f;
	float TAXED_SUBSIDY_DEDUCTION = STATE_SUBSIDY - (TAX_RATE*STATE_SUBSIDY);
	// methods are mostly public and abstract by default
	void addStateSubsidy(float subsidy);
	
	// Java 8 - add in default (defender) methods to deal with backward compatibility
	default void displayTaxedSubsidy() {
		System.out.println("Taxed Subsidy is " + TAXED_SUBSIDY_DEDUCTION);
	}
	
	//Java 8 - Static methods allowed. Interface can call it's own static method
	static void displaySubsidy() {
		System.out.println("Government subsidy is " + STATE_SUBSIDY);
		
	}
	
}
