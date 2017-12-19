package lab24;
import java.util.*;
public class Lab24Driver {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string to reverse:");
		String toBeReversed = scan.next();
		toBeReversed = reverseString(toBeReversed);
		scan.close();
		System.out.println("Reversed String: " + toBeReversed);
		int[] list = new int[] {5, 1, 2, 8, 7, 3, 9, 2, 4};
		System.out.println("Array values:" );
		for(int i = 0; i < list.length; i++){
			System.out.print(list[i] + " ");
		}
		System.out.println();
		System.out.print("Highest Value: " + findLargest(list, 0));
	}
	public static String reverse(String original){
//		int initialLow = 0;
//		int initialHigh = original.length() - 1;
//		while(initialLow != initialHigh){
//			original = reverse(original, initialLow, initialHigh);
//			initialLow++;
//			initialHigh--;
//		}
		return reverse(original, 0, original.length()-1);
	}
	public static String reverse(String source, int lowIndex, int highIndex){
//		char temp1 = source.charAt(lowIndex);
//		char temp2 = source.charAt(highIndex);
//		source = source.substring(0, lowIndex) + temp2 + source.substring(lowIndex + 1, highIndex) + temp1 ;
//		return source;
		
		//source = source.substring(0, lowIndex) + source.charAt(highIndex) + source.substring(lowIndex + 1, highIndex) + source.charAt(lowIndex);
		if(lowIndex >= highIndex){
			return source;
		}
		else{
			String part1 = source.substring(0, lowIndex);
			char high = source.charAt(highIndex);
			String part3 = source.substring(lowIndex + 1, highIndex);
			char low = source.charAt(lowIndex);
			source = part1 + high + part3 + low + source.substring(highIndex + 1);
			return reverse(source, lowIndex + 1, highIndex - 1);
		}
		
	}
	public static String reverseString(String source){
		if(source.length() <= 1){
			return source;
		}
		else{
			char first = source.charAt(0);
			return reverseString(source.substring(1)) + first;
		}
	}
	public static int max(int a, int b)
	{
	 if (a > b) { return a; }
	 else { return b; }
	}
	public static int findLargest(int[] list, int currentIndex){
		//int highValue = max(list[currentIndex], list[currentIndex+1]);
		
		if(currentIndex == list.length - 1){
			return list[currentIndex];
		}
		else{
			return max(list[currentIndex], findLargest(list, currentIndex + 1));
		}
	}
}
