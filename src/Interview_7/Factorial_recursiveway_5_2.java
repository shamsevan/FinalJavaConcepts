package Interview_7;

public class Factorial_recursiveway_5_2 {
	
//recursive: 
	
	public static int fact(int num) {
		
		if(num==0) return 1; 
		else {
			return (num*fact(num-1));
		}
		
		
	}
	
	

	public static void main(String[] args) {
	  
		System.out.println(fact(5));
       
	}

}
