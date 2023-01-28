package Interview_7;

import java.util.Scanner;

public class Scanner_Concept_1 {

	public static void main(String[] args) {
	
		int num=0; 
		
		System.out.println("Enter a number below and press enter button ");
		Scanner sc= new Scanner(System.in);
		
		num=sc.nextInt();
		
		
		
		System.out.println("this is the equation with our number : "+(num+10));
		

	}

}
