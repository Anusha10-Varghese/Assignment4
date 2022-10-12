package assignment8;

import java.util.PriorityQueue;

public class Q5d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> Q= new PriorityQueue<String>();
		Q.add("red");
		Q.add("rose");
		Q.add("yellow");
		Q.add("blue");
		Q.add("black");
		Q.offer("purple");
		System.out.println("Queue :"+Q);
		Q.removeAll(Q);
		System.out.println(Q);
	}

}
