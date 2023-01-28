package Arraylist_Basics_1;

import java.util.ArrayList;
import java.util.Iterator;

public class NonGeneric_Arraylists {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		
		//in Non generic type array we can add any datatype we want . 
		ar.add(10);
		ar.add("Shams");
		ar.add('c');
		ar.add(true);
		
		
		//length
		System.out.println(ar.size());
		
		
		//print what is in index 3
		System.out.println(ar.get(3));
		
		
		//iterator 
		//print all the value
		for (int i = 0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		

	}

}
