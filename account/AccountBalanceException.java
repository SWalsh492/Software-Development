package account;
// this is a custom built checked exception
// compiler cares about checked exception
// out of programmers control
public class AccountBalanceException extends Exception {
public AccountBalanceException(String string) {
	super(string); // calls base class - Exception-constructor
}
}
