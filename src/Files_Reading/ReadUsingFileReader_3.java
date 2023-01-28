package Files_Reading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadUsingFileReader_3 {

	public static void main(String[] args) {
		String filepath= "D:\\Eclipse Workspaces\\My all Eclipse\\Batch31\\FinalJavaConcepts\\shams.txt";
		FileReader fr=null;
		try {
			File file= new File(filepath) ;
			
			fr= new FileReader(file);
			System.out.println("This file content is : ");
			
			int c =0;
			
			while ( (c=fr.read()) != -1) {
				System.out.print((char)c);
			}
			
			
			
			
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
		

	}

}
