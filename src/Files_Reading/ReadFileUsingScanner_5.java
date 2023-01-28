package Files_Reading;

import java.io.File;
import java.util.Scanner;

public class ReadFileUsingScanner_5 {

	public static void main(String[] args) {
		String filepath= "D:\\Eclipse Workspaces\\My all Eclipse\\Batch31\\FinalJavaConcepts\\shams.txt";
		Scanner sc=null;
		
		
		try {
			File file= new File(filepath) ;
			sc= new Scanner(file);
			
			System.out.println("file content is :");
			
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
		}

	}

}
