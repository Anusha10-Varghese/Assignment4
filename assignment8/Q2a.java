package assignment8;

import java.util.Iterator;
import java.util.LinkedList;

public class Q2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list=new LinkedList<String>();

		list.add("mercury");
		list.add("mars");
		list.add("earth");
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	

	}

}
