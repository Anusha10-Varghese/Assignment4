package assignment4;

import java.util.Scanner;

public class TestInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the side of square: ");
		int s=sc.nextInt();
		Test t=new Arithmetic();
		System.out.println("The area of square: "+t.square(s));
			
	}

}
