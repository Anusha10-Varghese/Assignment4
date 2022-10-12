package assignment8;

import java.util.Iterator;
import java.util.LinkedList;

public class Q4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> cars=new LinkedList<String>();
		cars.add("i10");
		cars.add("bmw");
		cars.add("i20");
		cars.add("van");
		cars.add("jeep");
		Iterator<String> ii=cars.descendingIterator();
		while(ii.hasNext()) {
			System.out.println(ii.next());
		}

	}

}
