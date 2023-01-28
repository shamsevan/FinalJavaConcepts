package Maps_Hashtable_4;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;

public class Hashtable_Generic {

	public static void main(String[] args) {

		
		Hashtable<String, String> h = new Hashtable<>();
		

		h.put("ab4", "Hello");
		h.put("ab3","Hello");
		h.put("ab3", "it is null");
		h.put(null, "abc");
		

		System.out.println(h);
		
		
//		Set<String> keys =h.keySet();
//		
//		System.out.println(keys);
//		
//		Collection<String> allvalues =h.values();
//		System.out.println(allvalues);
//	
	 System.out.println(h.entrySet());
	     
	     
	    
	     
	     
	

	}

}
