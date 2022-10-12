package assignment8;

import java.util.ArrayList;
import java.util.Iterator;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("cat");
		list.add("dog");
		list.add("cow");
		System.out.println(list);
		list.add(1, "rat");
		for(String animal:list) {
			System.out.println(animal);
		}
	}

}
