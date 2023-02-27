package threads;

class MyRunnable implements Runnable{

	@Override
	public void run() {
		go();
	} // end run() method
	void go() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}// end try/catch
		doMore();
	} // end go() method
	void doMore(){
		System.out.println("Top of the stack");
	} // end doMore()
} // end class

public class TestThreadDrive {

	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		System.out.println("Back in main");
	}

}
