package account;
// Runtime Exception - compiler does not care
// flaw in the code
// should be dealt with by programmer
public class AccountCurrencyException extends RuntimeException {
public AccountCurrencyException(String string) {
	super(string);
}
}
