package Java_Memory_Basic;

public class StringsInJava {

	public static void main(String[] args) {
		String s1= "Hello world";		
		String s2="Hello world";
		String s3=s1; 
		
		String n1 = new String("Hello world");
		String n2 = new String("Hello world");
		
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1==s3);
        
		
		System.out.println(n1==n2);
		System.out.println(s1==n2);
	}

}
