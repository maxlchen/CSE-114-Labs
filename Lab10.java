//Max Chen
//111316366
import java.util.*;
public class Lab10 {
	public static void main(String[] args){
		int[] distArr = new int[15];
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a starting index for distribute:");
		int startin = scan.nextInt();
		for(int i = 0; i < distArr.length; i++){
			distArr[i] = (int) Math.floor(Math.random() * 13);
		}
		printOneDArray(distArr);
		System.out.println();
		distribute(distArr, startin);
		System.out.println("Distributed array:");
		printOneDArray(distArr);
		System.out.println();
		System.out.println("Enter the number of rows:");
		int rows = scan.nextInt();
		System.out.println("Enter the number of columns:");
		int cols = scan.nextInt();
		double[][] arr = new double[rows][cols];
		System.out.println("Enter the array values, one row at a time:");
		for(int j = 0; j<arr.length; j++){
			for(int k = 0; k<arr[0].length; k++){
				arr[j][k] = scan.nextDouble();
			}
		}
		int[] pos = locateLargest(arr);
		System.out.println("The largest element is at (" + pos[0] + ", " + pos[1] + ")");
		
		
	}
	public static void printOneDArray(int[] arr){
		for(int k = 0; k<arr.length; k++){
			System.out.print(arr[k] + " ");
		}
	}
	public static void distribute(int[] values, int start_index){

		int position = 0;
		int numToAdd = values[start_index];
		values[start_index] = 0;
		for(int i = start_index + 0; i<values.length - 1; i++){
			if(numToAdd == 0){
				break;
			}
			
			/*if((numToAdd>0) && (i == values.length)){
				i = 0;
				continue;
				/*for(int j = 0; j<numToAdd - 1; j++){
					values[j] = values[j] + 1;
					numToAdd--;
				}
				if(numToAdd==0)
					break;*/
			//}
			if(numToAdd>0)
				values[i+1] = values[i+1] + 1;
			numToAdd--;	
			
			
		}
		if(numToAdd!=0){
			while(numToAdd>0){
				values[position] = values[position] + 1;
				position++;
				numToAdd--;
				
			}
		}
		
	}

	public static int[] locateLargest(double [][] a){
		int rLargest=0, cLargest = 0;
		double largest;
		int[] largestPos = new int[2];
		largest = a[0][0];
		for(int r = 0; r<a.length; r++){
			for(int c = 0; c<a[0].length; c++){
				if(a[r][c]>largest){
					largest = a[r][c];
					rLargest = r;
					cLargest = c;
				}
				
			}
		}
		largestPos[0] = rLargest;
		largestPos[1] = cLargest;
		return largestPos;
		
		
	}


}
