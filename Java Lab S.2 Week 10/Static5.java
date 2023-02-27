public class Static5
{
	public static void main(String[] args)
	{
		Account grace = new Account("Grace", "Hopper", 100);
		Account bill = new Account("Bill","Gates", 300);
		Account ada = new Account("Ada", "Lovelace", 400);
		Account james = new Account("James","Gosling", 230);

		System.out.printf("The vault currently has %.2f \n\n", Account.getVault());

		grace.withdraw(150);
		bill.withdraw(100);
		ada.withdraw(1000);
		james.withdraw(50);
		grace.withdraw(99);




	}
}