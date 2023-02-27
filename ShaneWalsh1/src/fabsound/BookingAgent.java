package fabsound;

public class BookingAgent extends Musician implements CertificationMusic{
int x;
	void setBonus() {
	
	}
	
	//overloading the method
	void setBonus(int x) {
		
	}
	public static void main(String[] args) {
		Musician bobHorgan = new BookingAgent(); // polymorphism
	}

	@Override
	public void display() {
		
	}

}
