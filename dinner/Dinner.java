package dinner;

import dessert.*;
public class Dinner {
	public Dinner() {
		System.out.println("Dinner Constructor");
	}

	public static void main(String[] args) {
		Cookie x = new Cookie();
		Cake y = new Cake();
		//x.bite(); only friendly access
		y.bite();
	}

}
