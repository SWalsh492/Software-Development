package codeSnippets;

public class MyOuterClass {
private int x=7;
class MyInnerClass{
	void seeOuter() {
		System.out.println("Outer x is " +x);
		System.out.println("Inner class ref is " + this);
		System.out.println("Outer class ref is " + MyOuterClass.this);
	}
}
	public static void main(String[] args) {
		MyOuterClass outerobj = new MyOuterClass();
		MyOuterClass.MyInnerClass innerObj = outerobj.new MyInnerClass();
		innerObj.seeOuter();
	}

}
