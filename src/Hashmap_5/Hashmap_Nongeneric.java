package Hashmap_5;

import java.util.HashMap;

public class Hashmap_Nongeneric {

	public static void main(String[] args) {
       HashMap m = new HashMap();
		
		
		m.put(1, "abc");
		m.put("ab", 102);
		m.put('a', "hello");
		m.put(null, "abc");
		m.put(null, "chg");
		
		
		System.out.println(m.get(null));
//		System.out.println(m.entrySet());

	}

}
