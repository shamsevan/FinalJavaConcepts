package Files_Reading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadUsingFileInputStream_2 {

	public static void main(String[] args) {
		
		String filepath= "D:\\Eclipse Workspaces\\My all Eclipse\\Batch31\\FinalJavaConcepts\\shams.txt";
		FileInputStream fip=null;
		try {
			
			File file= new File(filepath) ;
			
			fip =new FileInputStream(file);
			
			System.out.println("The file content is : ");
			
			int c=0; 
			while( (c=fip.read()) != -1) {
				
				System.out.print((char)c);
			}		
			
		}
		catch (Exception e) {
		 e.printStackTrace();	
		}
		finally {
			try {
				fip.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
		
	
	}

}
