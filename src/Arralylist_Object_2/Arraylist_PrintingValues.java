package Arralylist_Object_2;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_PrintingValues {

	public static void main(String[] args) {
		
		MainConsClass e1= new MainConsClass("Shams", 27, "QA");
		MainConsClass e2= new MainConsClass("Nasir", 26, "Dev");
		MainConsClass e3= new MainConsClass("Evan", 22, "Admin");
		
		
		//Now create an Arraylist to insert the objects
				ArrayList<MainConsClass> ar = new ArrayList<MainConsClass>();
				
				//adding object Values to the Arraylist 
				ar.add(e1);
				ar.add(e2);
				ar.add(e3);
				
				
//				for(int i=0 ; i<ar.size();i++) {
//					System.out.println(ar.get(i).name);
//					System.out.println(ar.get(i).age);
//					System.out.println(ar.get(i).age);
//				}
				
				
				
				Iterator<MainConsClass> it = ar.iterator();
				
				while(it.hasNext()) {
				     MainConsClass ob=it.next();
				     System.out.println(ob.name);
				 	System.out.println(ob.age);
					System.out.println(ob.dept); 
				     
				}
		
	}

}
