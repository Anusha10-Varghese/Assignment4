package assignment4;

public class Outer {
	void display() {
		System.out.println("This is Outer class");
	}
	void test() {
		Inner in=new Inner();
		in.display();
		
	}
}
