package Sorting;

import java.io.File;  // Import the File class
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Random; 



public class createFiles {
	public static void main(String[] args) {
	    try {
	      File myObj = new File("300000.txt");
	      if (myObj.createNewFile()) {
	        System.out.println("File created: " + myObj.getName());
	      } else {
	        System.out.println("File already exists.");
	      }
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	    
        
	    try {
	        FileWriter myWriter = new FileWriter("300000.txt");
	        Random rand = new Random(); 
		    for(int i = 0; i <  300000; i++) {
		        int randomNum = rand.nextInt(5000000); 
		        String random = Integer.toString(randomNum);
		        myWriter.write(random + "\n");
		    }
	        myWriter.close();
	        System.out.println("Successfully wrote to the file.");
	    } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	    }
	}
}
