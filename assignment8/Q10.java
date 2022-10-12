package assignment8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> num=new ArrayList<>();
		num.add("1");
		num.add("2");
		num.add("3");
		num.add("4");
		num.add("5");
		num.add("6");
		num.add("7");
		num.add("8");
		num.add("9");
		num.add("10");
		System.out.println("Before Shuffle "+num);
		Collections.shuffle(num);
		System.out.println("After Shuffle "+num);
		
	}

}
