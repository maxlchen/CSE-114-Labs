//Max Chen
//111316366

import java.util.*;
public class Lab9bubbleSort {
	public static void main(String[] args){
		double[] array = {6.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5};
		bubbleSort(array);
		System.out.println();
		for(int k = 0; k<array.length; k++){
			System.out.print(array[k] + " ");
		}
		
	}
	public static void bubbleSort (double[] list){
		boolean changed = true;
		double temp;
		int count = 0;
		do{
			changed = false;
			count++;
			
			for(int j = 0; j<list.length - count; j++){
				if(list[j]> list[j+1]){
					temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
					System.out.print(list[j] + " ");
					changed = true;
				}
					
			}
		}
		while(changed);
	}

}
