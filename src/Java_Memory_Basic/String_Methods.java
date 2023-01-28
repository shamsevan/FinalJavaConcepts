package Java_Memory_Basic;

public class String_Methods {
	public static void main(String[] args) {
		
		
		
	//1. length of String 	
		String s1="i am shams";	
		System.out.println("length of String s1: " + s1.length() );
		
	//2. is empty ? 
		String s2= "";
		System.out.println(s2.isEmpty());
		String s3= "Hello";
		System.out.println(s3.isEmpty());
		
		
	//3. Trim() 
		String s4= "    i am working ";
		
		System.out.println(s4.length());
		String trimmedvalue= s4.trim();
		System.out.println(trimmedvalue);
		System.out.println(trimmedvalue.length());
		
		
		
     //4:  How to use trim() and Lenghth () together : 
		String s5= "         i am working very hard today           ";
		     int trimmedvaluesLength=s5.trim().length();
		     
		     
		     
     //5:comparing two Strings 
		     
		     String s6="Python";
		     String s7="python";
		     
		     System.out.println(s6.equals(s7));   // case sensitive 
		     System.out.println(s6.equalsIgnoreCase(s7));  //removes case sensitivity 
		     
		     
    //6 CompareTo : 
		     String s8="I am shams"; 		  
		     String s9= "I am faruk";		     
		     System.out.println(s8.compareTo(s9)); //shows the difference of Unicode Values
		     System.out.println(s8.compareToIgnoreCase(s9));
		     
		     String sc1= "a";
		     String sc2="A";
		     
		     System.out.println(sc1.compareTo(sc2)); //32
		     
		     
		     
		     
		     
   //7.concat : 
				String s10= "Dummmy";
				String s11= "Value";
				
				System.out.println(s10.concat(s11));
				System.out.println(s10.concat("faruk"));
				
  //8.join : 
				String s12= "Mercedies";
				String s13= "Toyota";
				String s14="Äudi";
				System.out.println(String.join(",", s12,s13,s14));
				
				
//9.Substring : 
				String sb1="ToyotaHondaNissan";
				
				System.out.println(sb1.substring(0,6));
				System.out.println(sb1.substring(6,11));
						
				
				
//10.Replace : 
				String s15= "I am Learning  am Selenium";
				System.out.println(s15.replace("am", "am not"));
				
				System.out.println(s15.replaceFirst("am","some"));
				System.out.println(s15.replaceAll(" ", "_"));
				System.out.println(s15.replaceAll("am(.*)", "add")); //for withdrawing everything after "am"
				
				
//11.index of : 
				String s16="Selenium"; 
				System.out.println(s16.indexOf(4));
				
//12.contains : 
				System.out.println(s16.contains("m"));
				
//13.endswith and Statrs with : 
				System.out.println(s16.startsWith("Sele"));
				System.out.println(s16.endsWith("um"));
				
				
				
				
				
				
		     
		
		
		
		
		
		
	}
}
