package assignment8;

import java.util.HashMap;
import java.util.Map;

public class Q2f {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "mango");
		map.put(2, "apple");
		map.put(3, "orange");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("size of hash: "+map.size());
	}

}
