package assignment8;

import java.util.ArrayList;
import java.util.Iterator;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList< String> list=new ArrayList<String>();
		list.add("anusha");
		list.add("sicily");
		list.add("varghese");
		Iterator itr=list.iterator();
		list.set(0, "parents");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
