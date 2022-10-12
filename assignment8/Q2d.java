package assignment8;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Q2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<String> Q= new PriorityQueue<String>();
		Q.add("red");
		Q.add("rose");
		Q.add("yellow");
		Q.add("blue");
		Q.add("black");
		Iterator<String> it=Q.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
