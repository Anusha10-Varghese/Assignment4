package assignment8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list= new ArrayList<String>();
		list.add("red");
		list.add("blue");
		list.add("rose");
		list.add("orange");
		Collections.sort(list);
		for(String color:list) {
			System.out.println(color);
			
	}
	}
}
