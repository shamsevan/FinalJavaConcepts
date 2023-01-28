package Interview_7;

import java.util.Scanner;

public class ArmStrong_2 {
	
	//find out 153 is a armstrong number
	//numbers can not be less than 0 

	public static void main(String[] args) {
	
		int num=0;		
	System.out.println("Enter the number below");	
	Scanner sc = new Scanner(System.in); 	
	num = sc.nextInt();
   
	System.out.println("we are checking num : "+ num);
	
//Process : 
	
	
	
	int sum=0;
	int r;
	int t; 
	
	t=num;//t= 153
	
	while (num>0) {
		r=num%10; //3
		sum = sum+(r*r*r); //27 
		num=num/10;
		
	}
		if (t==sum) {
			System.out.println("it is an armstrong number ");
		}
		
		else {
			System.out.println("it is not an armstrong number");
		}

	}

}
