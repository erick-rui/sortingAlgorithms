package Sorting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testHarness {
	
	static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.println(arr[i]+" "); 
        System.out.println(); 
    } 
  
    // Driver program 
    public static void main(String args[]) 
    { 
    	Scanner reader = new Scanner(System.in);  

    	System.out.println("Input Sizes:");
        System.out.println("1. 5,000");
        System.out.println("2. 25,000");
        System.out.println("3. 80,000");
        System.out.println("4. 150,000");
        System.out.println("5. 300,000");
        System.out.print("Choose a number: ");
        String inputSize = reader.nextLine();
        System.out.println("===================");
        

        int[] array = null;
        
        switch(inputSize) {
	    	case "1":
	    		array = readFile("5000.txt");
	    		break;
	    	case "2":
	    		array = readFile("25000.txt");
	    		break;
	    	case "3":
	    		array = readFile("80000.txt");
	    		break;
	    	case "4":
	    		array = readFile("150000.txt");
	    		break;
	    	case "5":
	    		array = readFile("300000.txt");
	    		break;
	    	default:
	    		System.out.println("invalid input");
        }
    
        
        SortingAlgorithms ob = new SortingAlgorithms();
        
        System.out.println("Sorting Algorithms:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        System.out.println("4. Merge Sort");
        System.out.println("5. Quick Sort");
        System.out.print("Choose a number: ");
        String sortChoice = reader.nextLine();
        System.out.println("===================");
        
        long start, totalTime = 0;
        
        reader.close();

        switch(sortChoice) {
        	case "1":
                start = java.lang.System.currentTimeMillis();
                ob.bubbleSort(array);
                totalTime = java.lang.System.currentTimeMillis() - start;
        		break;
        	case "2":
        		start = java.lang.System.currentTimeMillis();
                ob.selectionSort(array);
                totalTime = java.lang.System.currentTimeMillis() - start;
        		break;
        	case "3":
        		start = java.lang.System.currentTimeMillis();
                ob.insertionSort(array);
                totalTime = java.lang.System.currentTimeMillis() - start;
        		break;
        	case "4":
        		start = java.lang.System.currentTimeMillis();
                ob.mergeSort(array, 0, array.length - 1);
                totalTime = java.lang.System.currentTimeMillis() - start;
        		break;
        	case "5":
        		start = java.lang.System.currentTimeMillis();
                ob.quickSort(array, 0, array.length - 1);
                totalTime = java.lang.System.currentTimeMillis() - start;
        		break;
        	default:
        		System.out.println("invalid input");
      }

        
        System.out.println("total time: " + totalTime + " ms");
  
        System.out.println("sorted array"); 
        System.out.println(array.length); 
        //printArray(array); 
    } 
    
    public static int[] readFile(String fileName) {
    	List<Integer> list = new ArrayList<Integer>();
    	try {
    	      File myObj = new File(fileName);
    	      Scanner myReader = new Scanner(myObj);
    	      while (myReader.hasNext()) {
    	        int data = myReader.nextInt();
    	        list.add(data);
    	        //System.out.println(data);
    	      }
    	      myReader.close();
    	    } catch (FileNotFoundException e) {
    	      System.out.println("An error occurred.");
    	      e.printStackTrace();
    	    }
    	
    	int[] array = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
        	array[i] = list.get(i);
        
        
		return array;
    }
} 
