package assignment8;

import java.util.PriorityQueue;

public class Q3d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> Q1= new PriorityQueue<String>();
		PriorityQueue<String> Q2=new PriorityQueue<String>();
		Q1.add("red");
		Q1.add("rose");
		Q1.add("yellow");
		Q2.add("blue");
		Q2.add("black");
		Q2.add("pink");
		System.out.println("Q1 :"+Q1);
		System.out.println("Q2 :"+Q2);
		Q1.addAll(Q2);
		System.out.println("Q1 "+Q1);
	
	}

}
