//Max Chen
//111316366
import java.util.*;
public class Expand {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a line of text to be encoded");
		String input = scan.nextLine();
		expand(input);
		
	}
	public static void expand(String text){
		int times;
		String temp;
		char toPrint = ' ';
		for(int i = 0; i<text.length(); i++){
			if((text.charAt(i)>='a' && text.charAt(i)<= 'z') || (text.charAt(i)>= 'A' && text.charAt(i) <= 'Z')){
				toPrint = text.charAt(i);
			}
			else{
				times = Integer.parseInt(text.substring(i,i+1));
				for(int k = 1; k<=times; k++){
					System.out.print(toPrint);
				}
			}
		}
	}

}
