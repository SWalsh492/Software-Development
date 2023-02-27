public class Account
{
	private String firstName;
	private String lastName;
	private double balance;
	private static double vault;

	public Account(String f, String l, double deposit)
	{
		firstName = f;
		lastName = l;
		balance = deposit;
		vault += deposit;
	}

	public static double getVault()
	{
		return vault;
	}

	public void withdraw(double amount)
	{
		System.out.println(firstName + " " + lastName + " has requested to withdraw " + amount + " from the vault");
		if(amount > balance && amount <= vault)
		{
			System.out.println(firstName + " " + lastName + "'s current balance is " + balance);
			vault += balance;
			vault -= amount;
			balance -= amount;
			System.out.println("TRANSACTION COMPLETE");
			System.out.println(firstName + " " + lastName +"'s balance is now " + balance);
			System.out.println("There is now " + vault + " in the vault");
			System.out.println("-------------------------------------------\n");
		}
		else if(amount > vault)
		{
			System.out.println("But there is only " + vault + " in the vault.");
			System.out.println("NO TRANSACTION");
			System.out.println("-------------------------------------------\n");

		}
		else if(amount <= balance)
		{
			System.out.println(firstName + " " + lastName + "'s current balance is " + balance);
			balance -= amount;
			System.out.println("TRANSACTION COMPLETE");
			System.out.println(firstName + " " + lastName +"'s balance is now " + balance);
			System.out.println("There is now " + vault + " in the vault");
			System.out.println("-------------------------------------------\n");
		}
	}

}