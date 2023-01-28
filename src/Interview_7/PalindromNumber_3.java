package Interview_7;

import java.util.Scanner;

public class PalindromNumber_3 {

	public static void main(String[] args) {
		int num=0;		
		System.out.println("Enter the number below");	
		Scanner sc = new Scanner(System.in); 	
		num = sc.nextInt();
		System.out.println("we are checking num : "+ num);
		
//Process		
		int sum=0;
		int r; 
		int t; //number we have given
		
		t=num;
		
		while (num>0) {
			r=num%10;
			sum= (sum*10)+r;
			num=num/10;
	}
		
		if (t==sum) {
			System.out.println("it is a palindrome number");
		}
		else {
			System.out.println("it is not a palindrome number");
		}

	}

}
