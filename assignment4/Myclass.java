package assignment4;

public class Myclass implements A{
	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		System.out.println("This is method 1");
	}

	@Override
	public void meth2() {
		// TODO Auto-generated method stub
		System.out.println("This is method 2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new Myclass();
		a.meth1();
		a.meth2();
	}



}
