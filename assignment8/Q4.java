package assignment8;

import java.util.ArrayList;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("cat");
		list.add("dog");
		list.add("cow");
		list.add(1, "rat");
		String animal=list.get(1);
		
			System.out.println(animal);

	}

}
