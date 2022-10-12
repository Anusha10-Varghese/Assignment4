package assignment8;

import java.util.Iterator;
import java.util.LinkedList;

public class Q3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> s=new LinkedList<String>();
		s.add("rose");
		s.add("lilly");
		s.add("jasmine");
		s.add("marrygold");
		System.out.println(s);
		s.addFirst("lotus");
		Iterator<String> i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
