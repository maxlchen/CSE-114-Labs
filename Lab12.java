//Max Chen
//111316366
import java.util.*;
public class Lab12 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 511:");
		int input = scan.nextInt();
		String combination = nineBit(input);
		combination = convertHT(combination);
		for(int i = 1; i<=9; i++){
			System.out.print(combination.charAt(i - 1) + " ");
			if(i%3 == 0)
				System.out.println();
		}
		
	}
	public static String nineBit(int decVal){
		//String nine = Integer.toString(decVal, 2);
		String nine = "";
		String reverseNine = "";
		while(decVal>0){
			reverseNine += Integer.toString(decVal%2);
			decVal = decVal/2;
		}
		//Test System.out.println(reverseNine);
		for(int i = reverseNine.length() - 1; i >=0; i--){
			nine = nine + reverseNine.substring(i, i+1);
		}
		//System.out.println(nine);
		while(nine.length()<9){
			nine = "0" + nine;
		}
		return nine;
		
	}
	public static String convertHT(String binary){
		String temp = "";
		for(int i = 0; i < binary.length(); i++){
			if(binary.charAt(i) == '0'){
				temp = binary.substring(0, i) + "H" + binary.substring(i+1);
				binary = temp;
			}
			else {
				temp = binary.substring(0, i) + "T" + binary.substring(i+1);
				binary = temp;
			}
		}
		return temp;
		
	}

}
