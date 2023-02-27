package threads;

public class TestSync implements Runnable {
int balance;
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "Entering run()");
		
		for(int i=0; i < 50; i++)
			increment();
		System.out.println(Thread.currentThread().getName() + " Leaving run()");

		
	}// end run()
	synchronized void increment()
	{
		System.out.println("Current Balance of " + Thread.currentThread().getName() + " is " +balance);
		int i=balance; // two step process - Lost update problem
		balance= i+1; // two step process
		System.out.println("New Balance of " + Thread.currentThread().getName() + " is " +balance);
	} // end increment()

}
