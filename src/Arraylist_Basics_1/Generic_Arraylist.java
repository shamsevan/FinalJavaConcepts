package Arraylist_Basics_1;

import java.util.ArrayList;

public class Generic_Arraylist {

	public static void main(String[] args) {
		
		  ArrayList<Integer> ar2= new ArrayList<>();
		     
		     ar2.add(10); 
		     ar2.add(15); 
		     ar2.add(20); 
		     ar2.add(25); 
		     
		     
		     //length
		  	System.out.println(ar2.size());
		  	
		 	//print what is in index 4
		 	System.out.println(ar2.get(3));
		 	
		 	//print all the value
		 			for (int i = 0; i<ar2.size();i++) {
		 				System.out.println(ar2.get(i));
		 			}
		 			
		     
		     
		     
	}

}
