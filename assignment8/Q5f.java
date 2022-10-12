package assignment8;

import java.util.HashMap;
import java.util.Map;

public class Q5f {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
		  hash_map.put(1, "Red");
		  hash_map.put(2, "Green");
		  hash_map.put(3, "Black");
		  hash_map.put(4, "White");
		  hash_map.put(5, "Blue");
		  HashMap<Integer, String> hm = null;
		  for(Map.Entry m:hash_map.entrySet()){ 
			   System.out.println(m.getKey()+" "+m.getValue()); 
		  
	}

}
}