//Max Chen
//111316366
import java.util.*;
public class Backspace {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String text;
		System.out.println("Enter a string of text:");
		text = scan.nextLine();
		System.out.print(backspace(text));
	}
	public static String backspace(String text){
		String tempText = "";
		int backspaceCount;
		for(int i = 1; i < text.length(); i++){
			if(text.charAt(i) == '^' && text.charAt(i+1)== 'H'){
				text = text.substring(0, i-1) + text.substring(i+2);
				i -=3;
			}
		}
		return text;
	}

}
