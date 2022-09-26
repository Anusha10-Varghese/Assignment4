package assignment4;

public class Animal implements Dog,cat{


	@Override
	public void meow() {
		// TODO Auto-generated method stub
		System.out.println("meow.....");
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("bow....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Animal();
		a.bark();
		a.meow();
	}
}
