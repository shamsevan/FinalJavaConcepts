package Interview_7;

import java.util.Scanner;

public class Reverse_String_7 {
    
	public static void main(String[] args) {
	   
/*		String s="Evan"; 
		
		int length= s.length();
		
		String reverse=""; 
		
		for (int a=length-1;a>=0;a--) {
			reverse=reverse+s.charAt(a);
		}
		
		System.out.println(reverse);    */
		
//String buffer : 
		String s1="faruk"; 
	StringBuffer ob = new StringBuffer(s1); 
	
	  StringBuffer rev= ob.reverse();
	  
	  System.out.println(rev);
	  
	  
	    
	
		
		
//Scanner Process : 		
		String s=null;
	System.out.println("Enter your String value below");
	
	 Scanner sc = new Scanner(System.in);	 
	 s=sc.next();	 
	 System.out.println(s);
	 
	 String reverse=""; 
	 
	 int length= s.length();
	 

		for (int a=length-1;a>=0;a--) {
			reverse=reverse+s.charAt(a);
		}
		
		
		System.out.println("my reverse String is : "+reverse); 
		
	}
}
