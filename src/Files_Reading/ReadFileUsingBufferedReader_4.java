package Files_Reading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingBufferedReader_4 {

	public static void main(String[] args) {
		
		String filepath= "D:\\Eclipse Workspaces\\My all Eclipse\\Batch31\\FinalJavaConcepts\\shams.txt";
		BufferedReader br=null;
		
		
		try {
			File file= new File(filepath) ;
			
			br= new BufferedReader(new FileReader(file));
			
			System.out.println("the file content is : ");
			int c=0;  //initial unicode or askey value 
			while((c=br.read()) != -1) {
				System.out.print((char)c);
			}
			
			
			
			
			
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
