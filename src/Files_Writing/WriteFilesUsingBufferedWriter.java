package Files_Writing;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFilesUsingBufferedWriter {

	public static void main(String[] args) {
		BufferedWriter writer= null;
		
		
		String[] names = {"Shams","faruk","ummey"};
	
		try {
			
			writer=new BufferedWriter(new FileWriter("D:\\Eclipse Workspaces\\eal.txt"));
			
			writer.write("this is shams.");
			writer.write("\n that one is faruk.");
			
			for(String nm: names) {
				writer.write("\n"+ nm);  
			}		
			
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
