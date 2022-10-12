package assignment8;

import java.util.HashMap;
import java.util.Map;

public class Q1f {
public static void main(String[] args) {
	HashMap<Integer, String> map=new HashMap<Integer, String>();
	map.put(1, "mango");
	map.put(2, "apple");
	map.put(3, "orange");
	for(Map.Entry m:map.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
}
}
