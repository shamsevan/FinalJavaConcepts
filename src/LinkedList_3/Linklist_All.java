package LinkedList_3;

import java.util.Iterator;
import java.util.LinkedList;

public class Linklist_All {

	public static void main(String[] args) {
		
		LinkedList<String> ll= new LinkedList<>();
		
		//add :
	      ll.add("test");
	      ll.add("qtp");
	      ll.add("String");
	      ll.add("shams");
	      ll.add("Eal");
	      
	System.out.println("contant of ll : " + ll);    
	
	
	ll.addFirst("Faruk");
		
	System.out.println("contant of ll : " + ll);  
	
	ll.addLast("Ummey");
	System.out.println("contant of ll : " + ll);  	
	
	//get:
    System.out.println(ll.get(0));
	
    //set 
	ll.set(2, "integer");
	System.out.println(ll.get(2));
	
	////remove first index :
    ll.removeFirst();
    System.out.println(ll);
    
    //remove from last 
    ll.removeLast();
    System.out.println(ll);
    
    
    ll.remove(3);
    System.out.println(ll);
    
    
    Iterator<String> it = ll.iterator();
 	
    for ( int i =0;i<ll.size();i++) {
  	  System.out.println(ll.get(i));
    }    
    
    
    
//	while(it.hasNext()) {
//		System.out.println(it.next());
//	}
	}

}
