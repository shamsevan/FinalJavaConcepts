package Files_Reading;

import java.awt.Desktop;
import java.io.File;

public class OpenFileUsingDesktop_1 {

	public static void main(String[] args) {
		
     String filepath= "D:\\Eclipse Workspaces\\My all Eclipse\\Batch31\\FinalJavaConcepts\\shams.txt";
     
     try {    
        File file= new File(filepath) ;
        
        if(!Desktop.isDesktopSupported()) {
        	System.out.println("Desktop not supported");
        	return;      	
        }
        
        Desktop dsktp = Desktop.getDesktop();
        
        if(file.exists()) {
        	dsktp.open(file);
        }
        
        
        
     }
     
     catch(Exception e) {
    	 e.printStackTrace();
     }
	
   
	}

}
