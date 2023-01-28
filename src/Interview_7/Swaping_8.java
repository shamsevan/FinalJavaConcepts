package Interview_7;

public class Swaping_8 {

	public static void main(String[] args) {
		int a =10; int b=20; 
		
		System.out.println("Before swapping values are " + a + " "+b);
/*		
//logic 1 : Using Third Variable : 
		int t; 
		t=a;//10 
		a=b; // 
		b=t;
		
		System.out.println("After swapping values are " + a + " "+b);   */

		
/*			
//Logic 2 : without third  (using + - )
		
		a =a+b; //30
		b= a-b; //10; 
		a=a-b;// 20
		
		System.out.println("After swapping values are " + a + " "+b);    */
		
		
//Logic 3:  (using * and / ) condition , a and b can not be zero; 
		
		a= a*b; //200;
		
		b=a/b; //10;
		
		a= a/b; //20; 
		
		System.out.println("After swapping values are " + a + " "+b); 
		
		
		
		

	}

}
