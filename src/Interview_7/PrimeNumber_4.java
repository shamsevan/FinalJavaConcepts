package Interview_7;

import java.util.Scanner;

public class PrimeNumber_4 {
	/*	1. Natural number hote hobe. 1 er chaite boro hote hobe . 
	 *  2. Prime number mane hochhe emon number gulo jeguloke shudhu 2 ta number diye bhag jay(2 ta factor thake) ,as ,19 .etake only 1 and 19 diye e bhag jay.
	 *  3. Mane number er 2 ta factor thakbe only . not more than that. 2 ta number diye bhag korlei remainder 0 hote hobe. 
	 *  4. emon joto number ache, jeguloke shudhu she nije and 1 diye e bhag jay , shegulo kei prime number bole.
		  */
	public static void main(String[] args) {
		int num=0;		
		System.out.println("Enter the number below");	
		Scanner sc = new Scanner(System.in); 	
		num = sc.nextInt();
		System.out.println("we are checking num : "+ num);
		
//process start :
		int count=0; 
		
		if(num>1) {
			
			for (int i=1;i<=num;i++) {
				if(num%i==0) count++;	
			}
			
			if(count==2) {
				System.out.println("it is a prime number");
			}
			
			else {
				System.out.println("it is not a prime number");
			}
			
			
			
		}
		
		else {
			System.out.println("it is not a normal number");
		}

	}

}
