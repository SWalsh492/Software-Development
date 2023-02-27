package threads;

	class NameRunnable1 implements Runnable{

		@Override
		public void run() {
			for(int x=1; x<3; x++) {
				System.out.println("Run by " + Thread.currentThread().getName()+ ", x is " + x);
			}
		}
	}

public class ManyNames {
	public static void main(String[] args) {
		NameRunnable1 nr = new NameRunnable1();
		Thread one = new Thread(nr);
		Thread two = new Thread(nr);
		Thread three = new Thread(nr);
		one.setName("Clarke Kent");
		two.setName("Bruce Wayne");
		three.setName("Barry Allen");
		one.start();
		two.start();
		three.start();


		
	}

}
