package assignment8;

import java.util.LinkedList;

public class Q10a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> d=new LinkedList<String>();
		d.add(0, "pants");
		d.add(1, "jeans");
		d.add(2,"shrits");
		System.out.println(d);
		Object first=d.getFirst();
		System.out.println("first element: "+ first);
		Object last=d.getFirst();
		System.out.println("last element: "+ last);
	}

}
