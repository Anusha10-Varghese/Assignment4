package assignment8;

import java.util.PriorityQueue;

public class Q4d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> Q= new PriorityQueue<String>();
		Q.add("red");
		Q.add("rose");
		Q.add("yellow");
		Q.add("blue");
		Q.add("black");
		Q.offer("purple");
		for(String color:Q) {
			System.out.println(color);
		}
	}

}
