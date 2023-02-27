package fabsound;

public class MusicTeacher extends Musician{

	@Override
	void display() {
		
	}
	
	// composition
	MusicDegree m;
	public static void main(String[] args) {
		MusicTeacher ann = new MusicTeacher();
		ann.m.displayDegree(); // composition at work
		// music teacher HAS-A degree
	}
}
