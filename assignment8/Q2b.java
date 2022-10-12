package assignment8;

import java.util.HashSet;
import java.util.Iterator;

public class Q2b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<String>();
		set.add("ammu");
		set.add("raju");
		set.add("ramu");
		set.add("sita");
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
