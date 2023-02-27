package threads;

class FooRunnable implements Runnable{

	@Override
	public void run() {
		for(int x=1; x<=6; x++)
		{
			System.out.println("Runnable running!");
		}
	}
	
}

public class TestThreads {

	public static void main(String[] args) {
		FooRunnable r = new FooRunnable();
		Thread t = new Thread(r); // pass in FooRunnable object
		t.start();
		
	}

}
