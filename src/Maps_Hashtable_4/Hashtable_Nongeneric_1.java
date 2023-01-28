package Maps_Hashtable_4;

import java.util.Hashtable;

public class Hashtable_Nongeneric_1 {

	public static void main(String[] args) {
		Hashtable  h= new Hashtable();
		
		h.put("A", "test");
		h.put(1, "name");
		h.put('C', "name");
		h.put(1, 50);
		h.put(2, "name");
		
		// Duplicate key is not possible but duplicate value is possible 
		
		
//		System.out.println(h.size());
//		
//		System.out.println(h.get("A"));
		
		
		for(int i =0; i<h.size();i++) {
			System.out.println(h.get(i));
		}
		

	}

}
