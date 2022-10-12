package assignment8;

import java.util.Iterator;
import java.util.LinkedList;

public class Q5a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> bike=new LinkedList<String>();
		bike.add(0, "Honda");
		bike.add("apahe");
		bike.add(1, "suski");
		bike.add(2,"access");
		bike.add(3, "fc");
		Iterator<String> ii=bike.iterator();
		while(ii.hasNext()) {
			System.out.println(ii.next());
		}

	}

}
