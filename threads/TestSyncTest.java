package threads;

public class TestSyncTest {

	public static void main(String[] args) {
		TestSync job = new TestSync();
		Thread a = new Thread(job);
		Thread b = new Thread(job);
		a.setName("Thread A");
		b.setName("Thread B");
		a.start();
		b.start();

	}

}
