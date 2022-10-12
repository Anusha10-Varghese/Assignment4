package assignment8;

import java.util.Iterator;
import java.util.LinkedList;

public class Q1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<String>();
		list.add("cat");
		list.add("dog");
		list.add("tiger");
		System.out.println(list);
		list.addLast("cow");
		Iterator<String> i=list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
