package Java_Memory_Basic;

public class Test {
	
	int a,b;
	static int x; 
	
	public void m1() {
		int x=10;
		m2();
		
	}
	
	
	public void m2() {
		int y=20;		
		m3();
	}
	
	
	public void m3() {
		int z=300;
	}

	public static void main(String[] args) {
		
	Test ob = new Test();
	
	
	ob.m1();

	}
	

	
	


}
