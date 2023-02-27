package Thiskeyword;
//cascaded method calls
public class Leaf {
int i;
Leaf increment() {
	i++;
	//System.out.println(this);
	return this;
}
void print() {
	System.out.println("i is " + i);
}
	public static void main(String[] args) {
		Leaf x = new Leaf();
		x.increment().increment().increment().print();
	}
}
