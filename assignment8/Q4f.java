package assignment8;

import java.util.HashMap;
import java.util.Map;

public class Q4f {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "mango");
		map.put(2, "apple");
		map.put(3, "orange");
		System.out.println("Before");
		for(Map.Entry m:map.entrySet()) {
			
			System.out.println(m.getKey()+" "+m.getValue());
			}
		System.out.println();
		System.out.println("after");
		map.clear();
		for(Map.Entry m:map.entrySet()) {
			
			System.out.println(m.getKey()+" "+m.getValue());
			}
	}

}
