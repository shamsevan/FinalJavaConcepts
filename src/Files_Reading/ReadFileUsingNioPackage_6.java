package Files_Reading;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class ReadFileUsingNioPackage_6 {

	public static void main(String[] args) {
		
		String filepath= "D:\\Eclipse Workspaces\\My all Eclipse\\Batch31\\FinalJavaConcepts\\shams.txt";
		
		try {
			
		List<String> ls	=Files.readAllLines(Paths.get(filepath), StandardCharsets.UTF_8);
		
/*		for(int i=0;i<ls.size();i++) {
			System.out.println(ls.get(i));
		} */
		
		Iterator<String> it = ls.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
