package Debug_6;

public class Debug_3 {

	public static void main(String[] args) {
		
		Cars car1=new Cars("Shams");
		car1.setName("Toyota");
		car1.setModel(2021);
		
		car1= new Cars("faruk");
		
		
		Cars car2= new Cars("Rony");
		car2.setName("BmW");
		car2.getName();
		
		System.out.println(car2.getModel());
		
		Cars c[] = new Cars[2];
		c[0] = car1;
		c[1]=  car2;
		
	}

}
