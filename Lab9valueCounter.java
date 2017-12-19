//Max Chen
//111316366

import java.util.*;
public class Lab9valueCounter {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter an element of the array followed by a space.");
		int count = 0;
		for(int c = 0; c<arr.length; c++){
			arr[count] = scan.nextInt();
			//System.out.print(arr[count]);
			count++;
		}
		
		Arrays.sort(arr);
		valueCounter(arr);
	}
	public static void valueCounter(int[] values){
		int counter = 0;
		for(int i = 0; i < values.length; i++){
			
			for(int j = 0; j< values.length; j++){
				//System.out.println("Checking value of: " + values[i-1]);
				//System.out.println("J: " + values[j]);
				if(values[i]>=0 && values[i]==values[j]){
					counter++;
					if(j!=i){
						//System.out.println(values[i-1]);
						//System.out.println(values[j]);
						values[j] = -1;
						
						
					}
				}
				
				
				//else
					//counter = 1;
			}
				if(values[i]>=0){
					System.out.println(values[i] + " occurs " + counter + " times");
					counter = 0;
				}
				values[i] = -1;
				counter = 0;
			
		}
	}
	
	

}
