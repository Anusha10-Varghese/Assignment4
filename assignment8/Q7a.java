package assignment8;

import java.util.Iterator;
import java.util.LinkedList;

public class Q7a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> cars=new LinkedList<String>();
		cars.add("i10");
		cars.add("bmw");
		cars.add("i20");
		cars.add("van");
		cars.add("jeep");
		cars.addFirst("bus");

		Iterator<String> ii=cars.iterator();
		while(ii.hasNext()) {
			System.out.println(ii.next());
		}
	}

}
