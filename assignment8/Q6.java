package assignment8;

import java.util.ArrayList;
import java.util.Iterator;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList< String> list=new ArrayList<String>();
		list.add("home");
		list.add("sicily");
		list.add("varghese");
		list.add("anusha");
		list.remove(3);
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
