package mypkgfirst;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class filecopyexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  try {
	          
	            FileInputStream fis = new FileInputStream("input.txt");

	            
	            FileOutputStream fos = new FileOutputStream("output.txt");

	            byte[] buffer = new byte[50];  
	            int bytesRead;

	            
	            while ((bytesRead = fis.read(buffer, 0, buffer.length)) != -1) {

	                
	                fos.write(buffer, 0, bytesRead);
	            }

	            fis.close();
	            fos.close();

	            System.out.println("File copied successfully!");

	        } catch (IOException e) {
	            System.out.println("Error: " + e);
	        }
	    }
}
	









	


