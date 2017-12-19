//Max Chen
//111316366
package lab23;
import java.util.*;
public class Lab23Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to reverse:");
		int reverse = scan.nextInt();
		System.out.println("Reversed: ");
		reverseDisplay(reverse);
		System.out.println();
		System.out.println("Enter decimal to convert to binary:");
		int decimal = scan.nextInt();
		scan.close();
		System.out.println("Binary: " + dec2Bin(decimal));

	}
	public static void reverseDisplay(int value){
		int rightmost = value % 10;
		System.out.print(rightmost);
		int left = value / 10;
		if(left>0)
		reverseDisplay(left);
	}
	public static String dec2Bin(int value){
		String result = ((value % 2 == 0) ? "0" : "1"); 

	    if (Math.abs(value) > 1) {
	        result = dec2Bin(value / 2) + result;
	    }

	    return result;
	}

}
