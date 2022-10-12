package assignment8;

import java.util.HashMap;
import java.util.Map;

public class Q3f {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map=new HashMap<Integer, String>();

		map.put(1, "mango");
		map.put(2, "apple");
		HashMap<Integer, String> map1=new HashMap<Integer, String>();
		map1.put(3, "orange");
		map1.put(4,"grapes");
		System.out.println("first hash");
		for(Map.Entry m:map.entrySet()) {
		
		System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println();
		System.out.println("second hash");
		for(Map.Entry m1:map.entrySet()) {
			
			System.out.println(m1.getKey()+" "+m1.getValue());
			}
		map.putAll(map1);
		System.out.println();
		System.out.println("combined Together");
		for(Map.Entry m:map.entrySet()) {
			
			System.out.println(m.getKey()+" "+m.getValue());
			}
	}
	
}
