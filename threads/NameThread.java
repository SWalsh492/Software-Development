package threads;
class NameRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("NameRunnable running!");
		System.out.println("Run by "+ Thread.currentThread().getName());
	}
}
public class NameThread {

	public static void main(String[] args) {
		NameRunnable nr = new NameRunnable();
		System.out.println("Thread is " + Thread.currentThread().getName());
		//Thread t = new Thread(nr);
		//t.setName("Hal Jordan");
		//t.start();
	}
}
