//Name: Max Chen
//Student ID: 111316366
//Stony Brook University
//CSE 114
//Fall 2017
//Lab 22

package lab22;

import java.io.*;
import java.util.*;

public class FileReader {
	public static void main(String[] args){
	//String file = "test.txt";
	//FileInputStream f = new FileInputStream(test);
	int sum = 0;
	int counter = 0;
	double average = 0;
	//Scanner scan;
	//scan = new Scanner(f);
	try{
		Scanner diskScanner = new Scanner(new File("test.txt"));
		while(diskScanner.hasNextInt()){
			sum += diskScanner.nextInt();
			counter++;
			average = sum / counter;
		}
		diskScanner.close();
		System.out.println("Sum:" + sum);
		System.out.println("Average: " + average);
		
	}
	catch(FileNotFoundException ex){
		
		
	}
	}

	/*while(diskScanner.hasNextInt()){
		sum += diskScanner.nextInt();
		counter++;
		average = sum / counter;
	}
	diskScanner.close();
	System.out.println("Sum:" + sum);
	System.out.println("Average: " + average);
	}*/
	
	//PrintWriter pw = new PrintWriter(f);
	//public FileReader(){
		
	//}

}
