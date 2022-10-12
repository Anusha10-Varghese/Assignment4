package assignment8;

import java.util.ArrayList;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lst1=new ArrayList<String>();
		ArrayList<String> lst2=new ArrayList<String>();
		lst1.add("car");
		lst1.add("jeep");
		lst1.add("van");
		lst1.add("bus");
		lst2.clone();
		System.out.println("The first array "+lst1);
		lst2=(ArrayList<String>) lst1.clone();
		System.out.println("The cloned array "+lst2);
		
	}

}
