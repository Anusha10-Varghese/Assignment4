package assignment8;

import java.util.ArrayList;
import java.util.Iterator;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList< String> list=new ArrayList<String>();
		list.add("anusha");
		list.add("sicily");
		list.add("varghese");
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
