package Interview_7;

import java.util.Scanner;

public class Factorial_5 {
	//0's factorial is by default 1
	//4's factorial is 4*3*2*1 = 24; 
	

	public static void main(String[] args) {
		int num=0;		
		System.out.println("Enter the number below");	
		Scanner sc = new Scanner(System.in); 	
		num = sc.nextInt();
		System.out.println("we are checking num : "+ num);
		
//Process Started :		
 //Non recursive 
		int fact=1; 
		if(num==0) System.out.println("Factorial of 0 :" + 1);
		
		for(int i=1;i<=num;i++) {
			fact=fact*i; //1 , 2,3
		}
		
		System.out.println("factorial is " + fact);

	}

}
